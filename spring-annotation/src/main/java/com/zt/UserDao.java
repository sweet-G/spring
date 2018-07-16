package com.zt;

import org.springframework.stereotype.Repository;

/**
 * @author zhangtian
 * @date 2018/7/16
 */

@Repository
public class UserDao {

    public void save(){
        System.out.println("保存...");
    }
}
