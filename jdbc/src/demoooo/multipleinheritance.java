package demoooo;
interface demo{
	void display();
	default void display1(){
		System.out.println("default method calling........");
		
	}
}
interface demo1{
	 int dd=22;
	public abstract void run(int k);
	static void run1(int j){

    System.out.println(dd+j);		
		
	}
	
	
}


public class multipleinheritance implements demo,demo1 {
	int p;
	public void display(){
		System.out.println("method override");
	}
	public void run(int k){
		int u=this.p=k;
		System.out.println(u);
		
	}
	public static void main(String args[]){
		multipleinheritance mi=new multipleinheritance();
		mi.display1();
		mi.display();
		mi.run(33);
		demo1.run1(22);
		
	}

}
