package com.sunny.builder;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 19:36 2019/4/9
 */
public abstract class AbstarctBuilder {

    protected Product product = new Product();

    public abstract void buildA();

    public abstract void buildB();

    public abstract void buildC();

    public Product getResult(){
        return  product;
    }
}
