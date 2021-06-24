package com.jdbc1;
 class parent{
	 int c;
	 public void display(int a,int b){
		 c=a+b;
		 System.out.println(c);
		 
	 }
	 public int disply1(int c,int d){
		 return c*d;
		 
	 }
 }
public class inheritancedemo {
	public static void main(String args[]){
		parent p=new parent();
		p.display(12, 33);
		
		System.out.println(p.disply1(23, 8));
	}

}






