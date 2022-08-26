package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect
@Order(1)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointDemo(){

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before");
    }

    //最终通知，返回通知，有异常不执行
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after");
    }

    //后置通知，不管有没有异常都执行
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //环绕通知
    @Around(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前。。。。");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }


}
