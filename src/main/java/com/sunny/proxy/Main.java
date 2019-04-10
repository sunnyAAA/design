package com.sunny.proxy;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:33 2019/4/10
 */
public class Main {

    public static void main(String[] args) {
        ProxySubject  proxySubject = new ProxySubject(new RealSubject());
        proxySubject.show();
    }
}
