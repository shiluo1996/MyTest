package com.shiluo.test;

public class multiThreading {
    public static void main(String[] args) {
        Person p1 = new Person("张");
        MyThread mt = new MyThread();
        //开启线程，告诉CPU执行线程任务代码
        mt.start();

        p1.eat();
    }
}
