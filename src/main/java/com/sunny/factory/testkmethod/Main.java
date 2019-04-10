package com.sunny.factory.testkmethod;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 21:22 2019/4/9
 */
public class Main  {

    public static void main(String[] args) {
        AbstractFactory milkFactory = new MilkFactory();
        Product product = milkFactory.create();
        product.show();
    }
}
