package com.sgg.utility;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

// 动态代理
public class MyInvocationHandler implements InvocationHandler {
    // 接收委托对象
    private Object object = null;

    // 返回代理对象
    public Object bind(Object object){
        this.object = object;
        // 将 委托对象 的全部接口给 代理对象
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    // 日志信息由 代理对象 完成。
    // 业务代码利用反射机制由 委托对象 完成。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Array.toString(args) 将传入的参数按照 String数组打印出来
        System.out.println(method.getName()+ "方法的参数是" + Arrays.toString(args));
        // 通过反射机制来执行方法， 已知方法名，通过invoke(类名，参数)
        Object result = method.invoke(this.object,args);
        System.out.println(method.getName() + "方法的结果是" + result);
        return result;
    }
}
