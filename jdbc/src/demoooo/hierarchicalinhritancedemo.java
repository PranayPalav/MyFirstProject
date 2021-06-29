package demoooo;
class parent{
	int j;
	int k=44;
	public void display(int k){
		j=k;
		System.out.print(j);
		
	}
	
}
class B extends parent{
	public void run(){
		System.out.println("calling methods");
	}
	
}

class C extends parent{
	public void run1(){
		System.out.println("calling method 1");
	}
	
}
public class hierarchicalinhritancedemo {
	public static void main(String args[]){
		B b1=new B();
		b1.display(22);
		System.out.println();
		System.out.println(b1.k);
	}

}
