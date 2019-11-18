package com.songtianye.test.testStaticAndFinal;

//1.final修饰类《太监类》
//无法被继承,但可以继承其他非final类
public final class FinalDemo extends  Chinese {

    public static void main(String[] args) {
        final int num=1;
        //final修饰局部变量<包括基本类型+引用类型> ,只能赋值一次
        //num = 3;
        final Dog dog = new Dog();
        dog.age =10;
        dog.age = 20;//关于final修饰的引用变量，不能改变的是其地址，其内容是可以改变的
        //2.final修饰成员变量
        //2.1必须在创建对象之前已经有值了
        //静态的方法可以被继承，但不可被重写！
        test();
        System.out.println(num);
        //在静态上下文中不能引用非静态方法,1.方法改成静态方法；2.先声明一个对象，通过对象调用方法
        //this.show();
    }
    //3.被final修饰的方法不能被子类重写
    @Override
    public void show() {
        super.show();
    }
    //4.
}
