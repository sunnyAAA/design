package com.sunny.factory.abtractFactory;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 18:43 2019/4/8
 */
public class Main {

    public static void main(String[] args) {
        IAbstractFactory highPeopleFactory = new HighPeopleFactory();
        IBreakFast breakfast = highPeopleFactory.breakfast();
        breakfast.eat();
        Car car = highPeopleFactory.car();
        car.goWork();
    }
}
