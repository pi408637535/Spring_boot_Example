package com.wode.stock.service;

import com.wode.stock.bean.FavorStock;
import com.wode.stock.cache.JedisDataSet;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryApp;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryDataApp;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryDataMarket;
import com.wode.stock.dao.FavorStockDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * 自选股
 * 
 * @author wanghongda @date 2018年1月19日
 */
@Service
public class FavorStockServer {
	private static Log log = LogFactory.getLog(FavorStockServer.class);

	@Resource
    FavorStockDao favorStockDao;

	@Autowired
			@Qualifier("app")
	RedisConnectionFactory factory;

	@Resource(name = "app")
    RedisConnectionFactoryApp factoryApp;

	/*@Autowired
    RedisConnectionFactoryDataApp factoryDataApp;

	@Autowired
    RedisConnectionFactoryDataMarket factoryDataMarket;
*/
	public int test() {
		return favorStockDao.count();
	}

	public List<Map<String, Object>> getFavorStock() {
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		RedisConnection conn = factoryApp.getConnection();
		conn.select(2);
		Set<byte[]> set = conn.keys("*".getBytes());
		for (byte[] b : set) {
			System.out.println(new String(b));
		}
		List<FavorStock> favorStocks = favorStockDao.getListEntity(new FavorStock(100L));
		for (int i = 0; i < favorStocks.size(); i++) {
			FavorStock favorStock = favorStocks.get(i);
			String stockCode = favorStock.getStockCodeRedis();
			try {
				int stockType = 0;
				// 判断股票是否是大盘
				try {
					if (JedisDataSet.indexStockCodeList.contains(stockCode)) {
						stockType = 1;
					}
				} catch (Exception e) {
					// 异常表示,是个股
					stockType = 0;
				}

				Map<String, Object> favorStockMap = new HashMap<String, Object>();
				// 拼装数据
				favorStockMap.put("id", favorStock.getId());
				favorStockMap.put("stock_code", stockCode);// 股票编码
				favorStockMap.put("stock_type", stockType);
				// favorStockMap.put("update_time", json.get("update_time"));// 入榜时间
				favorStockMap.put("data_close", JedisDataSet.data_close.get(stockCode));// 当前价格
				// favorStockMap.put("data_settle",
				// JedisDataSet.data_settle.get(stockCode));// 昨收
				favorStockMap.put("data_toratio", JedisDataSet.data_toratio.get(stockCode));// 换手
				favorStockMap.put("data_totalmkt", JedisDataSet.data_totalmkt.get(stockCode));// 总市值
				favorStockMap.put("data_outstdmkt", JedisDataSet.data_outstdmkt.get(stockCode));// 流通市值
				favorStockMap.put("data_amplitude", JedisDataSet.data_amplitude.get(stockCode));// 振幅
				favorStockMap.put("data_percent", JedisDataSet.data_percent.get(stockCode));// 涨幅
				favorStockMap.put("data_price_change", JedisDataSet.data_price_change.get(stockCode));// 涨跌
				favorStockMap.put("wd_code", JedisDataSet.wd_code.get(stockCode));// wd信号
				favorStockMap.put("data_pe", JedisDataSet.data_pe.get(stockCode));// 市盈率
				favorStockMap.put("stock_name", JedisDataSet.stock_name.get(stockCode));// 股票名称
				favorStockMap.put("zl_net_in_flow", JedisDataSet.zl_net_in_flow.get(stockCode));// 主力净流入
				favorStockMap.put("isFavor", (favorStock.getFavorType()));// 是否盯盘
				result.add(favorStockMap);
			} catch (Exception e) {
				e.printStackTrace();
				log.info("getFavorStock error stockCode:" + stockCode);
			}
		}
		return result;
	}
}
