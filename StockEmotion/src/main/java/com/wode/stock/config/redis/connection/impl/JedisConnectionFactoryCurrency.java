package com.wode.stock.config.redis.connection.impl;

import com.wode.stock.config.redis.connection.RedisConnectionFactoryApp;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryDataApp;
import com.wode.stock.config.redis.connection.RedisConnectionFactoryDataMarket;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;


public class JedisConnectionFactoryCurrency extends JedisConnectionFactory implements RedisConnectionFactoryApp, RedisConnectionFactoryDataApp, RedisConnectionFactoryDataMarket {
}
