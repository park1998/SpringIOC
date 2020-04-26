package com.sgg.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect   // 表示该类是切⾯类。
@Component   // 将该类的对象注⼊到 IoC 容器。
public class loggerAspect {

    // 在实例化之前切入
    @Before(value = "execution(public int com.sgg.utility.CalImpl.*(..))")  // 表示⽅法执⾏的具体位置和时机。
    public void before(JoinPoint joinPoint) {
        // 获取方法名
        String MethodName = joinPoint.getSignature().getName();
        // 获取参数
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(MethodName + "方法的参数为：" + args);
    }


    @After(value = "execution(public int com.sgg.utility.CalImpl.*(..)) ")
    public void After(JoinPoint joinPoint) {
        // 获取方法名
        String MethodName = joinPoint.getSignature().getName();
        System.out.println(MethodName + "方法执行完毕");
    }

    @AfterReturning(value = "execution(public int com.sgg.utility.CalImpl.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        //获取⽅法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "⽅法的结果是" + result);
    }

    @AfterThrowing(value = "execution(public int com.sgg.utility.CalImpl.*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        //获取⽅法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "⽅法抛出异常：" + exception);
    }

}
