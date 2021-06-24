package oops;

abstract class calculator{
	abstract void addition(int a,int b);
	abstract void subtraction(int a,int b);
	public calculator() {
		// TODO Auto-generated constructor stub
		System.out.println("hello constructor");
	}
}

 abstract class Add extends calculator{
	int c;
	
	public void addition1(int a, int b){
		
		c=a+b;
		System.out.println(c);
		
	}
}
 class Sub extends Add{
	 int d,f;
	 public Sub() {
		// TODO Auto-generated constructor stub
		 super();
	}
	 public void subtraction(int a,int b){
		 d=a-b;
		 System.out.println(d);
		 
	 }
		public void addition(int k, int l){
			f=k+l;
			System.out.println(f);
			
		}
	
	 
 }

public class abstractiondemo {
	public static void main(String[] args) {
		Sub cal= new Sub();
		cal.addition(22, 33);
		cal.subtraction(33, 22);
		cal.addition1(55, 3);
		
		
}

}
