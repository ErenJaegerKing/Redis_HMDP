package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient(){
        // 配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://47.96.108.118:6379").setPassword("1zNwSkKuqEpPO6JHl9Wa85I3");
        // 创建RedissonClient对象
        return Redisson.create(config);
    }

}
