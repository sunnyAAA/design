package com.sunny.builder2;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 20:22 2019/4/9
 */
public class Main {

    public static void main(String[] args) {
       Builder builder = new StudentBuilder();
       Direct direct = new Direct(builder);
        Student construct = direct.construct();
        System.out.println(JSONObject.toJSONString(construct));
    }
}
