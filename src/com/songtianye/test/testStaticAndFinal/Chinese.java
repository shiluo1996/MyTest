package com.songtianye.test.testStaticAndFinal;

public class Chinese {
    int age;
    String name;
    String job;
    static String nation = "中国";
    public void setAge(int age){
        this.age = age;
    }
    public String getNation(){
        return this.nation;
    }
    public void notStatic(){
        System.out.println("非静态方法");
    }
    public static void test(){
        System.out.println("静态方法");
    }
    public  void show(){
     int Id =99;
    }
}
