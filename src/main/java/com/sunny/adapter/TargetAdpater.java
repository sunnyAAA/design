package com.sunny.adapter;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 21:13 2019/4/10
 */
public class TargetAdpater extends Adaptee implements Target {


    @Override
    public void request() {

        new Adaptee().specialRequest();
        System.out.println("traget");
    }
}
