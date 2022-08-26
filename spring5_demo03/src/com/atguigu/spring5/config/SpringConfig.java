package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      //Configuration注解作为配置类替代xml配置文件
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {


}
