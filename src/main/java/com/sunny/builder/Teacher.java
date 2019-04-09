package com.sunny.builder;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 20:01 2019/4/9
 */
public class Teacher {

    private int age;

    private Teacher(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Buider{
        private Teacher teacher;

        public Buider(){
            teacher = new Teacher();
        }

        public Buider buiderAge(int age){
            teacher.age = age;
            return this;
        }

        public Teacher build(){
            return teacher;
        }

    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher.Buider().buiderAge(12).build();
        System.out.println(JSONObject.toJSONString(teacher));
    }
}
