package com.sgg.Test;

import com.sgg.utility.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        Cal proxy = (Cal) applicationContext.getBean("calImpl");
        proxy.add(1, 1);
        proxy.sub(2, 1);
        proxy.mul(2, 2);
        proxy.div(6, 2);
    }
}
