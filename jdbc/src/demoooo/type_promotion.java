package demoooo;


// compile-time polymorphism 

public class type_promotion {
	public void display(double i){
		System.out.println(i);
	}
	public void display(int i,int j){
		System.out.println(i+j);
	}
	
	public static void main(String args[]){
		type_promotion t=new type_promotion();
		t.display('s');   // type promotion char ---promoted to--->double
		t.display(22,3);
		
		
	}

}
