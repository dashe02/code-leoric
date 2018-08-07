package com.leoric.code.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by wecash on 18/8/7.
 */
public class RedisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.17.0.2", 6379);
        String test = jedis.get("test");
        System.out.println(test);
    }
}
