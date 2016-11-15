package com.gome.wp.cache;

import com.gome.wp.util.SerializeUtil;
import org.apache.ibatis.cache.Cache;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by wode4 on 2016/11/15.
 */
public class MybatisRedisCache implements Cache
{
    /** The ReadWriteLock. */
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private String id;

    public MybatisRedisCache(final String id) {
        System.out.println("初始化");
        if (id == null) {
            throw new IllegalArgumentException("必须传入ID");
        }
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getSize() {
        Jedis jedis = null;
        JedisPool jedisPool = null;
        int result = 0;
        boolean borrowOrOprSuccess = true;
        try {
            jedis = CachePool.getInstance().getJedis();
            jedisPool = CachePool.getInstance().getJedisPool();
            result = Integer.valueOf(jedis.dbSize().toString());
        } catch (JedisConnectionException e) {
            borrowOrOprSuccess = false;
            if (jedis != null)
                jedisPool.returnBrokenResource(jedis);
        } finally {
            if (borrowOrOprSuccess)
                jedisPool.returnResource(jedis);
        }
        return result;

    }

    @Override
    public void putObject(Object key, Object value) {
        System.out.println("put key");
        Jedis jedis = null;
        JedisPool jedisPool = null;
        boolean borrowOrOprSuccess = true;
        try {
            jedis = CachePool.getInstance().getJedis();
            jedisPool = CachePool.getInstance().getJedisPool();
            jedis.set(SerializeUtil.serialize(key.hashCode()),
                SerializeUtil.serialize(value));
        } catch (JedisConnectionException e) {
            borrowOrOprSuccess = false;
            if (jedis != null)
                jedisPool.returnBrokenResource(jedis);
        } finally {
            if (borrowOrOprSuccess)
                jedisPool.returnResource(jedis);
        }

    }

    @Override
    public Object getObject(Object key) {
        System.out.println("get key");
        Jedis jedis = null;
        JedisPool jedisPool = null;
        Object value = null;
        boolean borrowOrOprSuccess = true;
        try {
            jedis = CachePool.getInstance().getJedis();
            jedisPool = CachePool.getInstance().getJedisPool();
            value = SerializeUtil.unserialize(jedis.get(SerializeUtil
                .serialize(key.hashCode())));
        } catch (JedisConnectionException e) {
            borrowOrOprSuccess = false;
            if (jedis != null)
                jedisPool.returnBrokenResource(jedis);
        } finally {
            if (borrowOrOprSuccess)
                jedisPool.returnResource(jedis);
        }
        return value;
    }

    @Override
    public Object removeObject(Object key) {
        System.out.println("remove key 到了设定时间");
        Jedis jedis = null;
        JedisPool jedisPool = null;
        Object value = null;
        boolean borrowOrOprSuccess = true;
        try {
            jedis = CachePool.getInstance().getJedis();
            jedisPool = CachePool.getInstance().getJedisPool();
            value = jedis.expire(SerializeUtil.serialize(key.hashCode()), 0);
        } catch (JedisConnectionException e) {
            borrowOrOprSuccess = false;
            if (jedis != null)
                jedisPool.returnBrokenResource(jedis);
        } finally {
            if (borrowOrOprSuccess)
                jedisPool.returnResource(jedis);
        }
        return value;
    }

    @Override
    public void clear() {
        System.out.println("clear all data");
        Jedis jedis = null;
        JedisPool jedisPool = null;
        boolean borrowOrOprSuccess = true;
        try {
            jedis = CachePool.getInstance().getJedis();
            jedisPool = CachePool.getInstance().getJedisPool();
            jedis.flushDB();
            jedis.flushAll();
        } catch (JedisConnectionException e) {
            borrowOrOprSuccess = false;
            if (jedis != null)
                jedisPool.returnBrokenResource(jedis);
        } finally {
            if (borrowOrOprSuccess)
                jedisPool.returnResource(jedis);
        }
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }


    public static class CachePool {
        JedisPool pool;
        private static final CachePool cachePool = new CachePool();

        public static CachePool getInstance() {
            return cachePool;
        }

        private CachePool() {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxIdle(100);
            config.setMaxWaitMillis(1000L);
            config.setMaxTotal(1000);

            config.setMinEvictableIdleTimeMillis(300000);
            config.setSoftMinEvictableIdleTimeMillis(-1);
            config.setNumTestsPerEvictionRun(3);
            config.setTimeBetweenEvictionRunsMillis(60000);//一分钟
            config.setMaxWaitMillis(15000);

			/*
			 * PropertiesLoader pl = new
			 * PropertiesLoader("classpath:config/redis.properties");
			 */
            // jedisPool= new JedisPool(config,"127.0.0.1",6379);
            pool = new JedisPool(config, "127.0.0.1", 6379);
        }

        public Jedis getJedis() {
            Jedis jedis = null;
            boolean borrowOrOprSuccess = true;
            try {
                jedis = pool.getResource();
            } catch (JedisConnectionException e) {
                borrowOrOprSuccess = false;
                if (jedis != null)
                    pool.returnBrokenResource(jedis);
            } finally {
                if (borrowOrOprSuccess)
                    pool.returnResource(jedis);
            }
            jedis = pool.getResource();
            return jedis;
        }

        public JedisPool getJedisPool() {
            return this.pool;
        }

    }
}
