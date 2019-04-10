package com.sunny.adapter.practice;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 21:18 2019/4/10
 */
public class Main {

    public static void main(String[] args) {
        Target target = new TargetAdapter(new Adaptee());
        target.show();

    }
}
