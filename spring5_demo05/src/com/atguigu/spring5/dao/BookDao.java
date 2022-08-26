package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    //添加的方法
    void add(Book book);

    //修改的方法
    void update(Book book);

    //删除的方法
    void delete(String id);

    //查询表记录数
    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBookInfo();

    void bacthAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
