package com.peramdy.service.impl;

import com.peramdy.dao.IUserDao;
import com.peramdy.dao.UserDaoImpl;
import com.peramdy.service.IUserService;
import org.apache.commons.lang.StringUtils;

/**
 * Created by Peramdy on 2017/2/7.
 */
public class UserServiceImpl implements IUserService {


    public Integer login(String userName, String passWords) {
        if(StringUtils.isBlank(userName)||StringUtils.isBlank(passWords))
            return 2;
        IUserDao userDao=new UserDaoImpl();
        return userDao.login(userName,passWords);
    }

}
