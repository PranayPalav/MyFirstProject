package demoooo;
import oops.*;     // import of package is important
  
//if u not import a pakage the its thrown an error
public class public_access_modifier_1 extends constructordemo {
	public static void main(String args[]){
		public_access_modifier_1 pam=new public_access_modifier_1(); // out of package
        constructordemoes sd=new constructordemoes();  // within same package
        
		System.out.println(pam.k);
		
		
	}

}
