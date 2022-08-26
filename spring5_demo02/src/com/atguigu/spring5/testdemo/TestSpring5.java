package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.autowire.Emp;
import com.atguigu.spring5.bean.Orders;
import com.atguigu.spring5.collectiontype.Book;
import com.atguigu.spring5.collectiontype.Course;
import com.atguigu.spring5.collectiontype.Stu;
import com.atguigu.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testCollection1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = applicationContext.getBean("stu",Stu.class);

        stu.test();

    }

    @Test
    public void testCollection2(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        //单实例对象测试
        /*Book book = applicationContext.getBean("book",Book.class);
        book.test();*/

        //多实例对象测试
        Book book1 = applicationContext.getBean("book",Book.class);
        Book book2 = applicationContext.getBean("book",Book.class);

        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testCollection3(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = applicationContext.getBean("myBean", Course.class);

        System.out.println(course);

    }

    @Test
    public void testCollection4(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testCollection5(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }
}
