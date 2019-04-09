package com.sunny.factory.factoryMethod;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 18:12 2019/4/8
 */
public class HorseFarm implements AnimalFarm {


    public Animal newAnimal() {
        return new Hose();
    }
}
