package com.songtianye.test.testStaticAndFinal;

public class test {
    //static 修饰类的成员
    public static void main(String[] args){
        //1.先创建对象，在通过对象调用成员变量
        Dog dog = new Dog();
        System.out.println(dog.age);
        //2.使用static修饰的成员变量，可以不用new 对象，直接用  类.变量  访问
        System.out.println(Dog.race);
        //new出对象后  也可以通过对象访问，同时可以对变量进行修改，但推荐通过类名访问
        Dog.race = "阿拉斯加";
        System.out.println(Dog.race);
        //3.什么时候使用static？？？
        //如果这个成员不属于某一个对象<>，而是所有对象共有的。
        //或者可以理解为，每个对象都相同的属性用static修饰。即每个狗狗的年龄都不一定一样，但他们的种族都是'狗'，因此race用static修饰，age不用static修饰
        Chinese ch = new Chinese();
        ch.age = 23;
        ch.name = "时洛";
        ch.job = "IT民工";
        ch.nation = "华夏";
        Chinese ch2 = new Chinese();
        ch2.name = "风十三";
        System.out.println(ch.name+"的国籍是： "+ch.nation+"原国籍是： "+Chinese.nation);
        //4.被static修饰的成员变量是所有对象共有的，因此ch的国籍改了，ch2的国籍也被修改
        //原因：static修饰的变量位于JVM方法区的静态区，对象从静态区找nation，修改也是修改这个nation。
        System.out.println(ch2.name+"的国籍是： "+ch2.getNation());
        Chinese.test();
        /*****************************测试final关键字**********************/
        //1.final修饰类《太监类》
        //无法被继承,但可以继承其他非final类
        //2.final修饰成员变量
        //2.1必须在创建对象之前已经有值了

        //3.修饰方法
        //不能被子类重写<牛逼方法>




    }
}
