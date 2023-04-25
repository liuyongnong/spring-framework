package org.springframework.liuyn.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AopClass {

    @Pointcut("execution(* org.springframework.liuyn.*.*(..))")
    public void pointcut(){
    };


    @Before("pointcut()")
    public void before(){
        long l = System.currentTimeMillis();
        System.out.println(String.format("运行之前的时间是 %s",l));
    }

    @After("pointcut()")
    public void after(){
        long l = System.currentTimeMillis();
        System.out.println(String.format("运行方法之后的时间是 %s",l));
    }



}
