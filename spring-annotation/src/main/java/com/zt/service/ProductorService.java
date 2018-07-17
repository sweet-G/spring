package com.zt.service;

import com.zt.dao.ProductorDao;
import com.zt.entity.Productor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhangtian
 * @date 2018/7/17
 */

@Service
public class ProductorService {

    @Autowired
    private ProductorDao productorDao;

    @Transactional(rollbackFor = Exception.class)
    public void batchSave(List<Productor> productorList){
        for(Productor productor : productorList){
            productorDao.save(productor);
        }

    }
}
