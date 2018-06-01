package com.sunney.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by piguanghua on 6/1/18.
 */
@Configuration
@ImportResource(locations= {"classpath:spring-kafka-consumer.xml"})
public class KafkaConfig {
}
