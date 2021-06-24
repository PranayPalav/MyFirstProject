package oops;

public class interfacedemo implements ABC {
	
	public void display1(){
		System.out.println("hii");
	}
	public static void main(String[] args) {
		interfacedemo id= new interfacedemo();
		id.display();
		id.display1();
		
	}

}
