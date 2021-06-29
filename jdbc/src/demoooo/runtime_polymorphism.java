package demoooo;

class demoesss{
  public void run(int j){
		System.out.println("calling parents method");
	}
}

public class runtime_polymorphism extends demoesss{
public void run(int j){
	System.out.println(j);
		
	}
	public static void main(String args[]){
		
		runtime_polymorphism rp=new runtime_polymorphism();
		rp.run(3);
		
	}

}
