package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class ApplicationConfig {

	@Bean
	public LettuceConnectionFactory lettuceConnectionFactory() {
		return new LettuceConnectionFactory();
	}

	@Bean
	public RedisTemplate redisTemplate() {
		RedisTemplate rt = new RedisTemplate<>();
		rt.setConnectionFactory(lettuceConnectionFactory());
		return rt;
	}

}
