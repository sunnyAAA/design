package com.sunny.factory.abtractFactory;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 18:41 2019/4/8
 */
public class LowPeopleFactory implements IAbstractFactory {

    public Car car() {
        return new Bike();
    }

    public IBreakFast breakfast() {
       return new Orange();
    }
}
