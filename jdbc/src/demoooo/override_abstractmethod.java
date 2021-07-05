package demoooo;

abstract class overridedemo{
	abstract void demo();
	
}
abstract class overridedemo1 extends overridedemo{
	 void demo1(){
		 System.out.println("hello");
	 }
	
}
public class override_abstractmethod extends overridedemo1{
	
	// if u not override the abstract method then errror occured 
	public void demo(){
		System.out.println("overide absract method");
	}
public static void main(String args[]){
	override_abstractmethod oa=new override_abstractmethod();
	oa.demo();
	oa.demo1();
//	overridedemo od=new overridedemo(); u cannot instatntiate object of an abstract class becaude abstract class is incomplete
}
}
