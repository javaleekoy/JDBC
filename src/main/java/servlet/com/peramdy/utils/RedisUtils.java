package servlet.com.peramdy.utils;

import lombok.Setter;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Peramdy on 2017/3/23.
 */
public class RedisUtils {

    private static String host ="192.168.164.222";
    private static int port =6379;
    private static int timeout =10000;
    private static String password ="redis_123";
    private static int MaxTotal =10;
    private static int MinIdle =5;
    private static int MaxIdle =2;

    private static JedisPool jedisPool = null;

    static {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(MaxIdle);
        jedisPoolConfig.setMinIdle(MinIdle);
        jedisPoolConfig.setMaxTotal(MaxTotal);
        jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
    }

    public static Jedis getInstance() {
        Jedis jedis=jedisPool.getResource();
        return jedis;
    }

}
