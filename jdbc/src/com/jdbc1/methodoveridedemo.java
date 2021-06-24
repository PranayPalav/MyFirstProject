package com.jdbc1;

class A{
	public void display(){
		System.out.println("hiii");
		
	}
}

class b extends A{
	public void display(){
		System.out.println("hello");
	}
}
public class methodoveridedemo {
	public static void main(String[] args) {
		b a=new b();
		a.display();
	}

}
