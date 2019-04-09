package com.sunny.factory.factoryMethod;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 18:13 2019/4/8
 */
public class CattleFarm implements AnimalFarm {

    public Animal newAnimal() {
        return  new Cattle();
    }
}
