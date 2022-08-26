package com.atguigu.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/*数据库操作
* 不写业务
* 创建两个方法，多钱和少钱*/
@Repository
public class UserDaoImpl implements UserDao{

    //注入jdbcTemplate对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /*lucy转账100给mary*/
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }

}
