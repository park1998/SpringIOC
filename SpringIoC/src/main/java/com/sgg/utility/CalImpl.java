package com.sgg.utility;


import org.springframework.stereotype.Component;

@Component
public class CalImpl implements Cal {
    // 利用 AOP 减少耦合代码，譬如下面的非业务代码 System.out.println

    public int add(int num1, int num2) {
        //System.out.println("参加计算的参数是 [ " + num1 + "," + num2 + " ]");
        int result = num1 + num2;
        //System.out.println("计算结果为：" + result);
        return result;
    }

    public int sub(int num1, int num2) {
        //System.out.println("参加计算的参数是 [ " + num1 + "," + num2 + " ]");
        int result = num1 - num2;
        //System.out.println("计算结果为：" + result);
        return result;
    }

    public int mul(int num1, int num2) {
        //System.out.println("参加计算的参数是 [ " + num1 + "," + num2 + " ]");
        int result = num1 * num2;
        //System.out.println("计算结果为：" + result);
        return result;
    }

    public int div(int num1, int num2) {
        //System.out.println("参加计算的参数是 [ " + num1 + "," + num2 + " ]");
        int result = num1 / num2;
        //System.out.println("计算结果为：" + result);
        return result;
    }
}
