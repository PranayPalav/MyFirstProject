package demoooo;
//final class finalaccess{
//	
//}
//class finalaccess1{
//	final void display(){
//		System.out.println("hello");
//	}
//}
//public class final_nonaccessmodifier_demo extends finalaccess1 {
//	 final int demo=10;
//	public void display(){
//		System.out.println("can we ovverride final method or not that we will see u as soon as possible");
//	}
//	public static void main(String args[]){
//		demo=233;
//		System.out.println(demo);
//		
//	}
//
//}

public class final_nonaccessmodifier_demo{
	final int a=10;
	final int b=20;
	final void display(){
		final int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String args[]){
//		a=a+b;
//	b=a-b;
//	a=a-b;
		final_nonaccessmodifier_demo fd=new final_nonaccessmodifier_demo();
		fd.display();
	
		
	}
}