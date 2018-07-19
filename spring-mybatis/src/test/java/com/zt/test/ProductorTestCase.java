package com.zt.test;

import com.zt.entity.Productor;
import com.zt.entity.ProductorExample;
import com.zt.mapper.ProductorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @author zhangtian
 * @date 2018/7/19
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springMybatis.xml")
public class ProductorTestCase {

    Logger logger = LoggerFactory.getLogger(ProductorTestCase.class);

    @Autowired
    private ProductorMapper productorMapper;

    @Test
    public void testSave(){
        Productor productor = new Productor();
        productor.setProName("魅族note");
        productor.setProNum(20);

        productorMapper.insert(productor);
        int id = productor.getId();
        logger.debug("id:{}",id);
    }

    @Test
    public void testFindByAll(){
        ProductorExample productorExample = new ProductorExample();

        List<Productor> productorList = productorMapper.selectByExample(productorExample);
        for(Productor productor: productorList){
            logger.debug("productor: {}",productor);
        }
    }


}
