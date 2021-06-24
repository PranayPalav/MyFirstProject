package com.jdbc1;
import java.util.*;
public class demo1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name;
		name=s.nextLine();
		demo d=new demo();
		d.setName(name);
		System.out.println(d.getName());
		
       
	}

}
