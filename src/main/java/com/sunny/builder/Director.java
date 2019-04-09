package com.sunny.builder;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 19:32 2019/4/9
 */
public class Director {

    private AbstarctBuilder builder;

    public Director(AbstarctBuilder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }
}
