package com.gome.wp.cache;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.w3c.dom.Element;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;
/**
 * Created by wode4 on 2016/11/15.
 */
public class RedisClient
{
    /**
     * 服务端地址
     */
    private static String host  = "127.0.0.1";

    /**
     * 服务端端口号
     */
    private static int port = 6379;

    /**
     * 密码
     */
    private static String password = null;

    private static JedisPool pool = null;

    /**
     * 初始化配置信息
     *
     * @param ele
     */
    public static void parse(Element ele) {
        if(ele == null)
            return ;

        host = ele.getAttribute("host");

        String strPort = ele.getAttribute("port");
        if(StringUtils.isNotBlank(strPort))
            port = NumberUtils.toInt(strPort, port);

        String pwd = ele.getAttribute("password");
        if(StringUtils.isNotBlank(pwd))
            password = pwd;
    }

    public static JedisPool getPool() {
        if (pool != null) {
            return pool;
        }

        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(6);
        config.setMinIdle(0);
        config.setMaxTotal(6);
        config.setMinEvictableIdleTimeMillis(300000);
        config.setSoftMinEvictableIdleTimeMillis(-1);
        config.setNumTestsPerEvictionRun(3);
        config.setTimeBetweenEvictionRunsMillis(60000);//一分钟
        config.setMaxWaitMillis(15000);

        pool = new JedisPool(config, host, port, 10000, password);

        return pool;
    }

    public static Jedis getResource(){
        return getPool().getResource();
    }

    public static void returnResource(Jedis jedis){
        getPool().returnResource(jedis);
    }

    public static void returnBrokenResource(Jedis jedis) {
        getPool().returnBrokenResource(jedis);
    }
}
