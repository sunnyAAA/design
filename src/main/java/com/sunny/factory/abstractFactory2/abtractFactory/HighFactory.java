package com.sunny.factory.abstractFactory2.abtractFactory;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:30 2019/4/9
 */
public class HighFactory implements AbstactFatory {

    public IBreakfast eat() {
        return new Orange();
    }

    public Car goWork() {
        return new BIke();
    }
}
