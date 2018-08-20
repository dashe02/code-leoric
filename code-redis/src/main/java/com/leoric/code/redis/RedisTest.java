package com.leoric.code.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by wecash on 18/8/7.
 */
public class RedisTest {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 5000);
        String result = jedis.set("test", "test2");
        System.out.println(result);
        if ("OK".equals(result)) {
            String value = jedis.get("test");
            System.out.println(value);
        }
    }
}
