package oops;

// ABC and ABCD INTERFACE ARE PART OF THIS PROGRAM
public class multipleinheritanceusinginterface implements ABC,ABCD {
	public void display1(){
		System.out.println("#####"); 
		
	}
	public void run1(){
		System.out.println("////////////");
	}
	public static void main(String args[]){
		multipleinheritanceusinginterface mi=new multipleinheritanceusinginterface();
		mi.display();
		mi.display1();
		mi.run();
		mi.run1();
 System.out.println(mi.k+mi.j);
		
	}

}
