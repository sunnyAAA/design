package com.sunny.builder2;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 20:18 2019/4/9
 */
public abstract class Builder {

    protected Student student = new Student();

    abstract void buiderAge();

    public Student build(){
        return student;
    }
}
