package com.zt.service;

import com.zt.dao.UserDao;

/**
 * @author zhangtian
 * @date 2018/7/14
 */

public class StudentService {

    private UserDao userDao;

    /*public StudentService(UserDao userDao){
        this.userDao = userDao;
    }*/

    public void save(){
        userDao.save();
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
}
