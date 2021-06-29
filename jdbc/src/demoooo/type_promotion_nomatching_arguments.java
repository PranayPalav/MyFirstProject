package demoooo;

public class type_promotion_nomatching_arguments {
	void display(int j,long k){
		System.out.println(j*k);
		
	}
	void display(long j,int k){
		System.out.println(j+k);
		
	}
	public static void main(String args[]){
		type_promotion_nomatching_arguments tpna=new type_promotion_nomatching_arguments();
		
		 //The method display(int, long) is ambiguous for the type type_promotion_nomatching_arguments
		//tpna.display(30,30);      // thrown an error
		tpna.display(20, 20l);
		tpna.display(20l, 20);

		
	}

}
