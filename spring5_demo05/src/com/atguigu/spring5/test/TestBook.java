package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestBook {

    @Test
    public void testJdbcTemplate1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加
        /*Book book = new Book();
        book.setUserId("3");
        book.setUseName("mysql");
        book.setUstatus("m");
        bookService.addBook(book);*/

        //修改
        /*Book book = new Book();
        book.setUserId("3");
        book.setUseName("java EE");
        book.setUstatus("Studying...");
        bookService.updateBook(book);*/

        //删除
        //bookService.deleteBook("1");

        //查询表记录值
        /*int count = bookService.findCount();
        System.out.println(count);*/

        //查询返回对象
        /*Book book = bookService.findOne("2");
        System.out.println(book);*/

        //查询返回集合
        /*List<Book> all = bookService.findAll();
        System.out.println(all);*/

        //批量增加
        /*List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"7", "hsd", "ef"};
        Object[] o2 = {"8", "C ++", "efs"};
        Object[] o3 = {"9", "Mysql", "sd"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);*/

        //批量修改
        /*List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java123", "ef", "4"};
        Object[] o2 = {"C ++123", "efs", "5"};
        Object[] o3 = {"Mysql123", "sd", "6"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchUpdate(batchArgs);*/

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"7"};
        Object[] o2 = {"8"};
        Object[] o3 = {"9"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }

}
