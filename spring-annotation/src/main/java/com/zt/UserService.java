package com.zt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

@Service
public class UserService {
    private UserDao userDao;

    public void save(){
        userDao.save();
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
