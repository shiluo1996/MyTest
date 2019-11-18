package com.shiluo.test;
//第一种开启线程方式
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 120; i++) {
            System.out.println("线程任务中的"+i);
        }
    }
}
