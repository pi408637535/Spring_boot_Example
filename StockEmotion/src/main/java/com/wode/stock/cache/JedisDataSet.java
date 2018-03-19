package com.wode.stock.cache;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wode.stock.Util.NumberFormat;
import com.wode.stock.Util.RedisQName;
import com.wode.stock.bean.Holiday;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryApp;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryDataApp;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryDataMarket;
import com.wode.stock.dao.HolidayDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Order(value=2)
public class JedisDataSet implements CommandLineRunner {
	private static Log log = LogFactory.getLog(JedisDataSet.class);
	
	@Resource
    HolidayDao holidayDao;
	
	//@Autowired
	RedisConnectionFactory factory;

	//@Autowired
	RedisConnectionFactoryApp factoryApp;

	//@Autowired
	RedisConnectionFactoryDataApp factoryDataApp;

	//@Autowired
	RedisConnectionFactoryDataMarket factoryDataMarket;

	// hmget CN:STK:STOCKINFO:+stockCode
	public static Map<String, Object> data_close = new HashMap<String, Object>();
	public static Map<String, Object> data_settle = new HashMap<String, Object>();
	public static Map<String, Object> data_toratio = new HashMap<String, Object>();
	public static Map<String, Object> data_totalmkt = new HashMap<String, Object>();
	public static Map<String, Object> data_outstdmkt = new HashMap<String, Object>();
	public static Map<String, Object> data_amplitude = new HashMap<String, Object>();
	public static Map<String, Object> data_percent = new HashMap<String, Object>();
	public static Map<String, Object> data_price_change = new HashMap<String, Object>();
	public static Map<String, Object> wd_code = new HashMap<String, Object>();
	public static Map<String, Object> data_pe = new HashMap<String, Object>();
	public static Map<String, Object> stock_name = new HashMap<String, Object>();
	// hgetall CN:STK:TICK:STOCKA
	public static Map<String, Object> zl_net_in_flow = new HashMap<String, Object>();

	// 人气榜 涨幅分别最高的三只股票(类型,数据模型)
	public static Map<String, Object> bestList = new HashMap<String, Object>();

	// 股票涨停时间记录
	public static Map<String, Long> stock_limit_time = new HashMap<String, Long>();

	/**
	 * 人气榜 历史 收益(涨幅)分别最高的三类股票 threesteps golden8 golden11
	 */
	public static Map<String, JSONArray> popularity_History_Top = new HashMap<String, JSONArray>();

	// 股票列表
	public static List<String> stockCodeList = new ArrayList<String>();
	public static List<String> indexStockCodeList = new ArrayList<String>();

	// 节假日列表 cvs格式
	public static String holidayStrs = "";
	
	
	/**
	 * 初始化
	 */
	@Override
	public void run(String... args) throws Exception {
		//addHolidayTask();
		//getStockInfoTask();
		//GetDateRedisTransTask();
		//getStockCodeList();	
	}

	// 获取节假日
	@Scheduled(cron = "0 0 1 * * ?")
	// 每日凌晨一点
	public void addHolidayTask() {
		try {
			List<Holiday> holidayList = holidayDao.getListEntity(new Holiday());
			StringBuffer sb = new StringBuffer();
			for (Holiday holiday : holidayList) {
				try {
					sb.append(LocalDate.parse((CharSequence) holiday.getHoliday())).append(",");
				} catch (Exception e) {
				}
			}
			holidayStrs = sb.toString();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	// 获取股市数据 GetDateRedisTask
	@Scheduled(cron = "0/3 * 9-16 * * 2-6")
	// 每分钟执行一次
	public void getStockInfoTask() {
		RedisConnection conn = factoryDataApp.getConnection();
		try {
			for (String stockCode : stockCodeList) {
				try {
					// 当前价格, 昨收, 换手, 总市值, 流通市值, 振幅, 涨幅, 涨跌, wd信号, 市盈, 股票名称
					List<byte[]> stockInfos = conn.hMGet(("CN:STK:STOCKINFO:" + stockCode).getBytes(), "data_close".getBytes(), "data_settle".getBytes(), "data_toratio".getBytes(),
							"data_totalmkt".getBytes(), "data_outstdmkt".getBytes(), "data_amplitude".getBytes(), "data_percent".getBytes(), "data_price_change".getBytes(), "wd_code".getBytes(),
							"data_pe".getBytes(), "stock_name".getBytes());
					JedisDataSet.data_close.put(stockCode, stockInfos.get(0));
					JedisDataSet.data_settle.put(stockCode, stockInfos.get(1));
					JedisDataSet.data_toratio.put(stockCode, stockInfos.get(2));
					JedisDataSet.data_totalmkt.put(stockCode, stockInfos.get(3));
					JedisDataSet.data_outstdmkt.put(stockCode, stockInfos.get(4));
					JedisDataSet.data_amplitude.put(stockCode, stockInfos.get(5));
					JedisDataSet.data_percent.put(stockCode, stockInfos.get(6));
					JedisDataSet.data_price_change.put(stockCode, stockInfos.get(7));
					JedisDataSet.wd_code.put(stockCode, stockInfos.get(8));
					JedisDataSet.data_pe.put(stockCode, stockInfos.get(9));
					JedisDataSet.stock_name.put(stockCode, stockInfos.get(10));
				} catch (Exception e) {
					e.printStackTrace();
					log.warn("获取redis数据错误,stockCode:" + stockCode);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 计算主力净流入
	@Scheduled(cron = "0 0/1 8-16 * * 2-6")
	// 每分钟执行一次
	public void GetDateRedisTransTask() {
		RedisConnection connDataMarket = factoryDataMarket.getConnection();
		try {
			Map<byte[], byte[]> stockA = connDataMarket.hGetAll(RedisQName.CN_STK_TICK_STOCKA);
			for (String stockCode : stockCodeList) {
			  try
              {
				String wd = (String) JedisDataSet.wd_code.get(stockCode);
				if(wd==null){
					continue;
				}
                //获取主力净流入
                if("5".equals(wd) || indexStockCodeList.contains(stockCode)){
                	JedisDataSet.zl_net_in_flow.put(stockCode,0);
                }else{
                	//获取股票k线
                    JSONObject curkline = JSON.parseObject(new String(stockA.get(stockCode.getBytes())));
                	JedisDataSet.zl_net_in_flow.put(stockCode, NumberFormat.decimalFormat((float) (curkline.getDouble("tick_acc_amt_ina") - curkline.getDouble("tick_acc_amt_outa"))));
                }  
              }
              catch (Exception e)
              {
                e.printStackTrace();
                log.warn("获取redis数据错误,stockCode:"+stockCode);
              }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 获取股票列列表
	@Scheduled(cron = "0 0/5 9-10 * * ?")
	// 每分钟执行一次
	public void getStockCodeList() {
		RedisConnection conn = factoryDataApp.getConnection();
		try {
			List<byte[]> stockList = conn.lRange(RedisQName.CN_STK_CODELIST_APP, 0L, -1L);
			for (byte[] stockByte : stockList) {
				String stockStr = new String(stockByte);
				JSONObject stock = JSON.parseObject(stockStr);
				stockCodeList.add(stock.getString("stock_code"));
			}
			List<byte[]> indexList = conn.lRange(RedisQName.CN_STK_INDEXLIST_APP, 0L, -1L);
			for (byte[] stockByte : indexList) {
				String stockStr = new String(stockByte);
				JSONObject stock = JSON.parseObject(stockStr);
				try {
					stockCodeList.add(stock.keySet().iterator().next().toString());
					indexStockCodeList.add(stock.keySet().iterator().next().toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	// //
	// @Scheduled(cron="0 0/1 * * * ?") //每分钟执行一次
	// public void getDateRedisTask() {
	// logger.info("每分钟执行一次。开始……");
	// //statusTask.healthCheck();
	// logger.info("每分钟执行一次。结束。");
	// }
	//
	// @Scheduled(cron="0 0/1 * * * ?") //每分钟执行一次
	// public void getDateRedisTask() {
	// logger.info("每分钟执行一次。开始……");
	// //statusTask.healthCheck();
	// logger.info("每分钟执行一次。结束。");
	// }
	//
	// @Scheduled(cron="0 0/1 * * * ?") //每分钟执行一次
	// public void getDateRedisTask() {
	// logger.info("每分钟执行一次。开始……");
	// //statusTask.healthCheck();
	// logger.info("每分钟执行一次。结束。");
	// }
}
