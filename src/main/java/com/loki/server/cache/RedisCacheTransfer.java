package com.loki.server.cache;

import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

public class RedisCacheTransfer {

    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
    }
}
