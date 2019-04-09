package com.sunny.factory.abstractFactory2.abtractFactory;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:31 2019/4/9
 */
public class Main {

    public static void main(String[] args) {
        AbstactFatory high = new HighFactory();
        IBreakfast eat = high.eat();
        eat.eat();
        Car car = high.goWork();
        car.show();
    }
}
