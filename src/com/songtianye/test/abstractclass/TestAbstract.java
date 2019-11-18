package com.songtianye.test.abstractclass;
//测试静态类2019年11月15日10:34:15
public  class TestAbstract {
    public  static final String height = "178";
    private static String getheight(){
        return height;
    }
    public Integer getAge(){
        TestInner.age = 18;
        return TestInner.age;
    }
    //静态内部类  final:不能有子类
    public final static class TestInner {
        public  String name;
        public static Integer age;
        public String getHeight(){
            //静态内部类可以间接访问  外部类的  静态  私有特征:必须是静态的static
            return  TestAbstract.height;
        }

    }

}
