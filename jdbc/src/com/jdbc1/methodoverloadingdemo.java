package com.jdbc1;

public class methodoverloadingdemo {
	public int display(int a){
		return a;
		
	}
	public int display(int a,int b){
		return a+b;
		
	}
	public static void main(String args[]){
methodoverloadingdemo m=new methodoverloadingdemo();
System.out.println("display output:");
System.out.println(m.display(2));
	}

}
