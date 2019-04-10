package com.sunny.proxy.pratice1.practice2;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 17:00 2019/4/10
 */
public class RealSubject implements AbstractSubject {

    @Override
    public void request() {
        System.out.println("haha");
    }
}
