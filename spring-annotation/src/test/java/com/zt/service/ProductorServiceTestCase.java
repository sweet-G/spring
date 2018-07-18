package com.zt.service;

import com.zt.Application;
import com.zt.dao.ProductorDao;
import com.zt.entity.Productor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangtian
 * @date 2018/7/17
 */

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:springAnnotation.xml")
@ContextConfiguration(classes = Application.class)
public class ProductorServiceTestCase {

    @Autowired
    private ProductorService productorService;

    @Test
    public void testBatchSave(){
        Productor productor = new Productor();
        productor.setProName("oppo");
        productor.setProNum(99);

        Productor productor1 = new Productor();
        productor1.setProName(null);
        productor1.setProNum(99);

        List<Productor> productorList = Arrays.asList(productor,productor1);
        productorService.batchSave(productorList);
    }
}
