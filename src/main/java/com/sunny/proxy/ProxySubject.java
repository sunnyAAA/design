package com.sunny.proxy;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:31 2019/4/10
 */
public class ProxySubject implements Subject {


    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject){
        test();
        this.realSubject = realSubject;
        stop();
    }

    @Override
    public void show() {
        realSubject.show();
    }

    private void test(){
        System.out.println("pre");
    }

    private void stop(){
        System.out.println("stop");
    }
}
