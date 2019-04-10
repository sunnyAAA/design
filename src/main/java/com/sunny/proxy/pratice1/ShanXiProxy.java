package com.sunny.proxy.pratice1;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:37 2019/4/10
 */
public class ShanXiProxy implements Special {

    private ShanXiSpecial shanXiSpecial;

    public ShanXiProxy(){

        shanXiSpecial = new ShanXiSpecial();


    }

    @Override
    public void display() {

        pre();
        shanXiSpecial.display();
        stop();
    }

    public void pre(){
        System.out.println("pre");
    }

    public void stop(){
        System.out.println("stop");
    }
}
