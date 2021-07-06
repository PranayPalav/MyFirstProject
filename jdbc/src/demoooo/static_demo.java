package demoooo;
class stats{
	
	// static variable
	static int  num2=display1();
	static String name="sudarshan";
	static int num=99;
	
	
	// static method
	static void display(){
		System.out.println("static method calling");
		
	}
	static int display1(){
		System.out.println("hello static ");
		return 6;
		
	}
}
public class static_demo extends stats {
static int num1,num3;

//  static block
	static{
	num3=display1();
		num1=num;  // u  Cannot make a static reference to the non-static field num1(if u not declare num1 as a static)
	}
	public static void main(String args[]){
		display();     // u can call static method without initialize the object
	System.out.println(name);
	System.out.println(num1);
	System.out.println(num2);
	System.out.println("hello num3 "+num3);
	}
	

}
