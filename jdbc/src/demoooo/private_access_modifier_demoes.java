package demoooo;


// u cannot declare class as a private 
public  class private_access_modifier_demoes {
	private int a=20;
	private void run1(){
		a=20;
		System.out.println(a);
		System.out.println("accessible within a class only beacause access modifire is a private");
		
	}
	public static void main(String args[]){
		default_access_modifier_demoes dd=new default_access_modifier_demoes();
	//	dd.run();      // its thrown an error beacause run is a private method
		               // private methods and filed are accessible within a class only
		
		private_access_modifier_demoes pd=new private_access_modifier_demoes();
		pd.run1();
	}

}
