package demoooo;



class accessmodifier{
	protected void display(){
		
		System.out.println("hiiiii");
	
	}
	void display1(){
		System.out.println("default accesss modifer....");
	}
	synchronized void display2(){
		System.out.println("synchronized non access modifier");
	}
	strictfp void display3(){
		System.out.println("strictfp modifier");
	}
//	protected void run1(){
//		System.out.println("default access modifire......");
//	}
	
//	public void run(){
//		System.out.println("access modifier demo checking.......");
//	}
	
	
}

public class runtime_polymorphism_accessmofier extends accessmodifier{
public void display(){
	System.out.println("protcted hellooooo");
}
void display2(){
	System.out.println("sunchronized success");
}
protected void display1(){
	System.out.println("default hiiiiiii");
}
 void display3(){
	System.out.println("strictfp demo");
}

// void run1(){
//	System.out.println("hiiiiii.....");
//}

// public having more accessibity then protected so result is causing error

//protected void run(){
//	System.out.println("hello");
//}
public static void main(String args[]){
	runtime_polymorphism_accessmofier rpa=new runtime_polymorphism_accessmofier();
	rpa.display();
	rpa.display1();

	rpa.display2();
	rpa.display3();

	accessmodifier am=new accessmodifier();
	am.display();
	am.display1();
	am.display2();
	am.display3();
	
}
}
