package com.sunny.builder;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 19:52 2019/4/9
 */
public class Student {

    private int age ;

    private int sex;

    private int schoolname;


    private Student(){

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(int schoolname) {
        this.schoolname = schoolname;
    }

    public static class Builder{
        private Student student;

        public Builder(){
            student = new Student();
        }

        public Builder builderAge(int age){
            student.setAge(age);
            return this;
        }

        public Builder builderSex(int sex){
            student.setSex(sex);
            return this;
        }

        public Builder builderSchool(int school){
            student.setSchoolname(school);
            return this;
        }

        public Student build(){
            return student;
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder().builderAge(1).builderSchool(12).builderSex(1).build();
        System.out.println(JSONObject.toJSONString(student));
    }
}
