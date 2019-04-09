package com.sunny.single;

import sun.jvm.hotspot.runtime.Thread;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @Author: Sunny
 * @Description:
 * @Date: Created in 16:58 2019/4/8
 */
public class Main {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(10);



        executorService.submit(new Runnable() {
            public void run() {
                while (true){
                    int i = SingleTest.getInstance().hashCode();
                    HashSet set = new HashSet();
                    set.add(i);
                    System.out.println();
                    System.out.println(SingleTest.getInstance());
                }
            }
        });

    }
}
