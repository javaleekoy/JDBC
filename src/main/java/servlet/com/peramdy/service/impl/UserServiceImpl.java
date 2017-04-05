package servlet.com.peramdy.service.impl;


import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import servlet.com.peramdy.dao.IUserDao;
import servlet.com.peramdy.dao.impl.UserDaoImpl;
import servlet.com.peramdy.service.IUserService;

/**
 * Created by Peramdy on 2017/2/7.
 */
public class UserServiceImpl implements IUserService {

    Logger logger= Logger.getLogger(UserServiceImpl.class);

    public Integer login(String userName, String password) {
        logger.info("userName:"+userName+",passwords:"+password);
        if(StringUtils.isBlank(userName)||StringUtils.isBlank(password))
            return 2;
        IUserDao userDao=new UserDaoImpl();
        return userDao.login_redis(userName,password);
    }

}
