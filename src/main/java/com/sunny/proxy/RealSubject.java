package com.sunny.proxy;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:30 2019/4/10
 */
public class RealSubject implements Subject {

    @Override
    public void show() {

        System.out.println("hhaah");
    }
}
