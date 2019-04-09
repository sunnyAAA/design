package com.sunny.factory.factoryMethod;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 18:14 2019/4/8
 */
public class Main {

    public static void main(String[] args) {
        AnimalFarm cattleFarm = new CattleFarm();
        Animal animal = cattleFarm.newAnimal();
        animal.show();
    }
}
