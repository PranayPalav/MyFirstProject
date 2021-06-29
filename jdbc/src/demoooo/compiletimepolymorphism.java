package demoooo;

public class compiletimepolymorphism {
	
	// change squence of argument
	// differnt argument 
	// diiferent no of an argument
	//
	
	
	// comments the method for varargs method
// public void display(){
//System.out.println("hiii");	 
// }
// 
	
	
	
 // if u change return type with same 
 // This method must return a result of type String (this erroer shown)
	
	
// public String display(float b){
//System.out.println("hiiiiii"); 
//}
	public void display(float a){
		System.out.println(a);
	}
   
    public void display(Object a){           //object is the parent class of all the classes
    	System.out.println("object method");
    }
	
	public void display(int j){
		System.out.println(j);
	}
	
	public void display(int...a)    // vararg dataype...variablename   
	{   
		System.out.println("varargument calling");
		
	}
	public void display(int j,String name){
		
		System.out.println(j);
	}
	public void display(int j,int k){
		System.out.println(j+k);
	}
	
	public void display(String name1,int y){
		System.out.println(name1);
		System.out.println(y);
	}
	public static void main(String[] args) {
	compiletimepolymorphism c=new compiletimepolymorphism();
	c.display(2, 4);
	c.display(4, "pranay");
    c.display("palav", 23);		
    c.display('s');   // istead  of int we pub char value beacause compiler promote char value to int so it can write the ascci value of s
	c.display();   //  if u not create method with no argument then its called varagrment method 
	c.display(22.3f);  // if u not declared value as a float then its call an object method
	}

}
