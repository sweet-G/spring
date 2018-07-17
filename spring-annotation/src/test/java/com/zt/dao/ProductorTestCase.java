package com.zt.dao;

import com.zt.entity.Productor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * @author zhangtian
 * @date 2018/7/17
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springAnnotation.xml")
public class ProductorTestCase {

    @Autowired
    private ProductorDao productorDao;

    @Test
    public void testSave(){
        Productor productor = new Productor();
        productor.setProName("三星");
        productor.setProNum(202);
        productorDao.save(productor);
    }

    @Test
    public void testFindById(){
        Productor productor = productorDao.findById(2);
        System.out.println(productor);
    }

    @Test
    public void testFindAll(){
        List<Productor> productorList = productorDao.findAll();
        for(Productor productor : productorList){
            System.out.println(productor);
        }
    }

    @Test
    public void testCount(){
        int count = productorDao.count();
        System.out.println(count);
    }
    @Test
    public void testFindMapList(){
        List<Map<String, Object>> maps = productorDao.findMapList();
        for(Map<String, Object> map : maps){
            for(Map.Entry<String, Object> entry : map.entrySet()){
                System.out.println(entry);
            }
        }
    }
}
