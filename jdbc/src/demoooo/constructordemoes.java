package demoooo;
class example11{
	public example11() {
		// TODO Auto-generated constructor stub
		System.out.println("call default constructor");
	}
	
	
	public example11(int k,String name){
	System.out.println(k);	
	System.out.println(name);
	}
	
	
	public void display(){
		System.out.println("display method");
	}
	
	
	protected example11(int l){
		System.out.println(l);
		System.out.print("protected constructor calling......");
		
	}
	protected example11(String fname,String lname){
		String fullname=fname + lname;
		System.out.println(fullname);
	}
	
	
}

public class constructordemoes extends example11{
	
	public constructordemoes() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("calling default constructor od superclass");
	}
	public constructordemoes(int y){
		 super(44, "hello");
		
		System.out.println("hello");
		
	}
	constructordemoes( int id,int age,String address){
		super("pranay", "palav");
		System.out.println(id);
		System.out.println(age);
		System.out.println(address);
		
		
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
	private constructordemoes(int f,int k){
		int j=f;
		int l=k;
		System.out.println(j*l);
	}
	
	
	public static void main(String args[]){
	constructordemoes cd=new constructordemoes();
	constructordemoes dd=new constructordemoes(3);
	constructordemoes ddd=new constructordemoes(22,55);
	constructordemoes d3=new constructordemoes(4, 25, "dahisar");
	example11 e=new example11(33);
	cd.display();
	
	}
	

}
