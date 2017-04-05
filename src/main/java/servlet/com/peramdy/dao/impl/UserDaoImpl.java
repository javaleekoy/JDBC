package servlet.com.peramdy.dao.impl;

import org.apache.log4j.Logger;
import redis.clients.jedis.Jedis;
import servlet.com.peramdy.dao.IUserDao;
import servlet.com.peramdy.utils.RedisUtils;

/**
 * Created by Peramdy on 2017/3/23.
 */
public class UserDaoImpl implements IUserDao {

    Logger logger=Logger.getLogger(UserDaoImpl.class);

    @Override
    public Integer login_mysql(String userName, String password) {

        return null;
    }

    @Override
    public Integer login_redis(String userName, String password) {
        Jedis jedis=RedisUtils.getInstance();
//        Jedis jedis=new Jedis("192.168.164.222");
//        jedis.auth("redis_123");
        String password_redis=jedis.get(userName);
        logger.info("reids中取到的password值："+password_redis);
        if(password.equals(password_redis))
            return 1;
        return 2;
    }
}
