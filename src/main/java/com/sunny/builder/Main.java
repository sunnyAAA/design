package com.sunny.builder;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 19:43 2019/4/9
 */
public class Main {

    public static void main(String[] args) {
        AbstarctBuilder builder = new Builder();
        Director director = new Director(builder);
        Product construct = director.construct();
        System.out.println(JSONObject.toJSON(construct));

    }
}
