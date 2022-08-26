package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//注解里面value属性值可以不写
//默认是类名称，首字母小写
//UserService--userService
//@Component  //等价于bean id值和value值等价
@Service
public class UserService {
    @Value(value = "abc")
    private String name;

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注释
    /*@Autowired      //根据类型注入
    @Qualifier(value = "user")
    private UserDao userDao;*/

    @Resource(name = "user")       //根据类型注入，也可以根据名称注入
    private UserDao userDao;

    public void add(){
        System.out.println("service add" + name);
        userDao.add();
    }
}
