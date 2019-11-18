package com.songtianye.test.abstractclass;

import java.security.PublicKey;

public class Test {
    public  final int num = 11;
    public static void main(String[] args){
    //创建内部类对象: new外部类.内部类()
    TestAbstract.TestInner in = new TestAbstract.TestInner();
    TestAbstract out = new TestAbstract();
    //静态内部类可以间接访问  外部类的  静态  私有特征:必须是静态的
        System.out.println(in.getHeight());
        System.out.println(in.age);
        System.out.println(out.getAge());
        System.out.println(in.age);

        //System.out.println(num);

    }
}