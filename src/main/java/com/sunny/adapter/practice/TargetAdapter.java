package com.sunny.adapter.practice;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 21:17 2019/4/10
 */
public class TargetAdapter implements Target {

    private Adaptee adaptee ;

    public TargetAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void show() {
        System.out.println(121111111);
        adaptee.showSpecial();
    }
}
