package com.songtianye.test.firstday;
import java.lang.Exception;
public class TestExtend {
         //测试子类继承父类的构造函数
        public static void main(String args[]) throws Exception {
  //FatherClass fa = new FatherClass();
  //FatherClass fa1 = new FatherClass(100);
         SonClass son = new SonClass(233);

         son.callDaddy();
        boolean a = son instanceof FatherClass;
        System.out.println(a);
           // SonClass son1 = new SonClass(200);
            //son1.fun(2);
        }

}
class FatherClass{
    public FatherClass(){
        System.out.println("父类 无参 构造函数");
    }
    public FatherClass(int i){
        System.out.println("父类 一个参数构造函数super = "+i);
    }
    public FatherClass(int i,String j){
        System.out.println("父类 一个参数构造函数superi = "+i+",superj = "+j);
    }
    public void callDaddy() throws Exception {
        //throw new Exception("抛出异常");
        if(true){ throw new Exception("抛出异常");}
        System.out.println("call me daddy");
    }
    public int age = 50;
    protected int height = 178;
}
class SonClass extends FatherClass{
    /*public SonClass(){
//      super(22);//line 1
        System.out.println("子类 无参 构造函数");
    }*/
    public int age;
    public int height;
    public SonClass(int a) throws Exception {
        //super();

        super(2);
        super.callDaddy();
        this.height=185;
        super.height = 180;

        //super(33,"Hello");//line 2
        System.out.println("子类一个参数构造函数sub = "+a);
        System.out.println("父亲的身高："+super.height);
        System.out.println("孩子的身高："+this.height);
        //System.out.println(super);
        System.out.println(super.toString());
        System.out.println(this.toString());

    }
    public void fun(int a){//子类中定义一个实例函数
        //super(33,"Hello");//构造函数调用必须声明在构造函数中,这行代码不注释的话会报错
        System.out.println("子类一个参数构造函数sub = "+a);
    }
}
