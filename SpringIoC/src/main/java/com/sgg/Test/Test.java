package com.sgg.Test;

import com.sgg.utility.Cal;
import com.sgg.utility.CalImpl;
import com.sgg.utility.MyInvocationHandler;

public class Test {
    public static void main(String[] args) {
        // 不使用代理对象
//        CalImpl cal = new CalImpl();
//        cal.add(1,1);
//        cal.sub(2,1);
//        cal.mul(2,2);
//        cal.div(6,2);

        // 通过代理对象
        Cal cal = new CalImpl();   // 多态：虽然是父类对象，但是调用的是子类的方法
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal bind = (Cal) myInvocationHandler.bind(cal);
        bind.add(1, 1);
        bind.sub(2, 1);
        bind.mul(2, 2);
        bind.div(6, 2);
    }
}
