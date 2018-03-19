package com.wode.stock.config.redis;

import com.wode.stock.config.redis.connection.RedisConnectionFactoryApp;
import com.wode.stock.config.redis.connection.impl.JedisConnectionFactoryCurrency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfigApp {
	@Bean(name = "app")
	public RedisConnectionFactoryApp redisCF() {
		// 如果什么参数都不设置，默认连接本地6379端口
		JedisConnectionFactoryCurrency factory = new JedisConnectionFactoryCurrency();
		factory.setPort(16379);
		factory.setHostName("123.196.116.201");
		factory.setPassword("password123");
		return factory;
	}
}