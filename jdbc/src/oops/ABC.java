package oops;

public interface ABC {
	 int j=44;                 // bydefault compiler conside variable as public static final
	default void display(){
		System.out.println("hello");
		
	}
 void  display1();
 
 
 
//or u can write like these 
 
 // public abstract void display2();   // like that
 
 
 

}
