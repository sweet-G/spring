package com.zt;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangtian
 * @date 2018/7/17
 */
@Configuration //标记spring配置文件
@ComponentScan //开启自动扫描，也可以设置basepackage路径
@EnableAspectJAutoProxy //开启注解
public class Application {

}
