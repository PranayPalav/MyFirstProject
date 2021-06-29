package demoooo;

interface  y{
	public abstract void display();
}
interface w extends y {
	public abstract void display1();
	
}
interface z extends y{
	public abstract void display2();
	

default void display3(){
	System.out.println("default method is called");
}
	
}
public class hybridinheritance implements w,z {
	public void display(){
		System.out.println("hii");
	}
	public void display1(){
		System.out.println("hello");
	}
	public void display2(){
		System.out.println("hellllloooooo");
		
	}
	public static void main(String args[]){
		hybridinheritance h=new hybridinheritance();
		h.display();
		h.display1();
		h.display2();
		h.display3();
		
	}

}
