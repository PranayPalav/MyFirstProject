package demoooo;

class display{
	//parent class required parent exception
	 void demo() throws ArithmeticException{   
		System.out.println("hiiii");
	}
	 void demo1() throws NullPointerException{   
		System.out.println("hiiii ,1");
	}
	 void demo2() throws RuntimeException{   
			System.out.println("hiiii ,2");
		}
	 void demo3() throws ArithmeticException{   
			System.out.println("hiiii,3");
		}
//	 void demo4() throws Exception{   
//			System.out.println("hiiii,4");
//		}

}
public class override_and_Exception extends display {
//	void demo()throws Exception{
//		System.out.println("hiiii");
//	}
	 void demo1() throws ArithmeticException{   
		System.out.println("hello , 1");
	}
	 void demo2() throws ArithmeticException{   
			System.out.println("hello , 2");
		}

	 void demo3() throws RuntimeException{
		 
		System.out.println("hello,3");
	 }
	//child class required child exception or u can throws same level exception
	void demo() throws RuntimeException{
		System.out.println("hello");
	}
	
//	void demo4() {   
//		System.out.println("hello , 4");
//	}
	public static void main(String args[]){
		override_and_Exception oae=new override_and_Exception();
		oae.demo();
		oae.demo1();
		oae.demo2();
		oae.demo3();
	
		
	display d=new display();
	d.demo();
	d.demo1();
	d.demo2();
	d.demo3();
	
	}
}
