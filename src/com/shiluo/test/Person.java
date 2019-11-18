package com.shiluo.test;

class Person{
	public static final int NUM = 20;
	String name;
	Person(String name){
		this.name = name;
	}

	//听音乐
	void music(){
		for (int i=1;i<=NUM;i++ )		{
			System.out.println(name+"在听第"+i+"首歌");
		}
	}
	//吃饭
	void eat()	{
		for (int i=1;i<=NUM;i++ )		{
			System.out.println(name+"在吃第"+i+"口饭");
		}
	}

}
