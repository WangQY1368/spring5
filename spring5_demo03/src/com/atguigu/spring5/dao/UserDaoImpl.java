package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "user")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add");
    }
}
