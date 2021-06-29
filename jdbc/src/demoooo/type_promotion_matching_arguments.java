package demoooo;

// compile time polymorphism
//type promotion is not worked when arguments are same

public class type_promotion_matching_arguments {
	void display(){
		System.out.println("hello");
	}
	
// in display method there are 2 argument (int int) and (long long) thats why time promotion is not possible in this condition 
	void display(int i,int k){
		System.out.println(i*k);
	}
	void display(long i,long k){
		System.out.println(i+k);
	}
	public static void main(String args[]){
		type_promotion_matching_arguments tppe=new type_promotion_matching_arguments();
		tppe.display(20, 20);
		
	}

}
