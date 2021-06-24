package oops;
abstract class A{
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("hiiiii");
	}
	public A(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
}

public class CallAbstractclassConstructor extends A {
	public CallAbstractclassConstructor() {
		super();
		System.out.println("additio is");
		// TODO Auto-generated constructor stub
	}
	public CallAbstractclassConstructor(int j){
		super(11, 2);
		System.out.println(j);
	
	}
	
	public static void main(String args[]){
		CallAbstractclassConstructor ab=new CallAbstractclassConstructor();
		CallAbstractclassConstructor ab1=new CallAbstractclassConstructor(23);

		
	}

}
