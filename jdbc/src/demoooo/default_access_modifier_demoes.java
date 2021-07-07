package demoooo;
import oops.*;
 class default_access_modifier_demoes{

	public static void main(String[] args) {
		
		// compile time error thrown 
		// default_access_modifier_demoes_1 is a default class .
		// default class is accessible within package only not an outside the package7
		
		//  error code are bellow the line and right now code is commented 
//		default_access_modifier_demoes_1 df=new default_access_modifier_demoes_1();
//		df.display(5);
		
		
		//but if class if not a default if it is public then u can acess data's of this class
		// u can use protected as well but for that imheritance concept is neccessary 
		
		
		default_access_modifier_demoes_1 df=new default_access_modifier_demoes_1();
		df.display(10);
	}

}
