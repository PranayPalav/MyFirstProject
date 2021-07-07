package demoooo;
import oops.*;


// if u need to access protected data from another package its compulsory to import the package...
// and inheritance is compulsory....
public class protected_access_modifier_demos extends constructordemo {
	public static void main(String args[]){
		protected_access_modifier_demos pd=new protected_access_modifier_demos();
		pd.run();
		//access protected data
		System.out.println("access protected variable j:- "+pd.j);
		
	}

}
