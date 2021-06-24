package com.jdbc1;
abstract class demoes{
	 public void display() {
		// TODO Auto-generated constructor stub
		 System.out.println("hey public,gm to all");
	}
	 public demoes() {
		// TODO Auto-generated constructor stub
		 System.out.println("hello");
	}
	 String name="pranay";
}

 class demoes1 extends demoes {
	 
public void run(){
	System.out.println("hey pranay gm nice to see you");
	System.out.println(name);
	
}
}
 public class abstractiondemo{
	 public static void main(String[] args) {
		demoes1 d=new demoes1();
		d.run();
		d.display();
	}
 }
