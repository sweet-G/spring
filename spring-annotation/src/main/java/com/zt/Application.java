package com.zt;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author zhangtian
 * @date 2018/7/17
 */
@Configuration //标记spring配置文件
@ComponentScan //开启自动扫描，也可以设置basepackage路径
@EnableAspectJAutoProxy //开启注解
//将数据库配置转为Java配置
@PropertySource("classpath:config.properties")
public class Application {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource(){

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
        basicDataSource.setUrl(environment.getProperty("jdbc.url"));
        basicDataSource.setUsername(environment.getProperty("jdbc.username"));
        basicDataSource.setPassword(environment.getProperty("jdbc.password"));

        return basicDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());

        return jdbcTemplate;
    }

}
