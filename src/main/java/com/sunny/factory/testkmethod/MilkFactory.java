package com.sunny.factory.testkmethod;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 21:22 2019/4/9
 */
public class MilkFactory implements AbstractFactory {

    public Product create() {
        return  new Milk();
    }
}
