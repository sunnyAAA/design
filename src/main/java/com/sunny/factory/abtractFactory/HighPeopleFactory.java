package com.sunny.factory.abtractFactory;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 18:41 2019/4/8
 */
public class HighPeopleFactory implements IAbstractFactory {

    public Car car() {
        return new Bus();
    }

    public IBreakFast breakfast() {
       return new Milk();
    }
}
