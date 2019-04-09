package com.sunny.builder2;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 20:20 2019/4/9
 */
public class Direct {

    private Builder builder;

    public Direct(Builder builder){
        this.builder = builder;
    }

    public Student construct(){
        builder.buiderAge();
        return builder.build();
    }
}
