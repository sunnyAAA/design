package com.sunny.single;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:56 2019/4/8
 */
public class SingleTest {

    private static    SingleTest  singleTest = null;

    private SingleTest(){

    }


    public static synchronized  SingleTest getInstance(){
        if(singleTest ==null){
            singleTest = new SingleTest();
        }
        return singleTest;
    }


}
