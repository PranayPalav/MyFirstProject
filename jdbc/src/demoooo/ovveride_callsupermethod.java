package demoooo;

class superclass{
	void run()
	{
		System.out.println("superclass method");
	}
}
public class ovveride_callsupermethod extends superclass {
	void run(){
		super.run();
		System.out.println("subclass method");
		
	}
	public static void main(String args[]){
	ovveride_callsupermethod ocs=new ovveride_callsupermethod();
	ocs.run();
	
	}

}
