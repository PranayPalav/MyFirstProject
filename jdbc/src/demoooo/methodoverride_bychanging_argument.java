package demoooo;
// u can change the return type of an method but parent class method having parent return type and suclass required child return type
//to avoid this error u can use the concept of covarient return type
class change_returntype{
/*	public int display(){
		System.out.println("hello");
		return 3;
	}
	String run(){
		return "hello";
		
	}
	
	 Integer run1(){
		 System.out.println(2);
		 return 22;
	 }
	 */
	
	public Object display(){   // Object is parent return type of string return type
		return "4";
	}
	Object run(){
		return 55;
	}
	 Number run1(){
		 System.out.println(2);
		 return 22;
	 }
}
public class methodoverride_bychanging_argument extends change_returntype {
	
	/*
	 * this code having error because changing return type in incompetible 
	 * because parent method return type are not parent return type 
	 
	public String display(){
		return "4";
	}
	int run(){
		return 55;
	}
	 Number run1(){
		 System.out.println(2);
		 return 22;
	 }
	 */
	
	public String display(){
		return "4";
	}
	Float run(){
		return 55.6f;
	}
	 Number run1(){
		 System.out.println(2);
		 return 22;
	 }
	
	public static void main(String args[]){
		methodoverride_bychanging_argument moa=new methodoverride_bychanging_argument();
System.out.println(moa.display());	
System.out.println(moa.run());	
System.out.println(moa.run1());	



System.out.println("parent method calling ........");
System.out.println();
change_returntype ca=new change_returntype();
System.out.println(ca.display());
System.out.println(ca.run());
System.out.println(ca.run1());	

	}

}
