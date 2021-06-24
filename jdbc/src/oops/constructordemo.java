package oops;
class construct{
	int j;
	public construct() {
		// TODO Auto-generated constructor stub
		System.out.println("hi hello");
	}
  public construct(int y){
	  j=y;
	  System.out.println(j);
  }
}

public class constructordemo extends construct {
	
  public static void main(String[] args) {
	construct b1=new construct();
	construct b2=new construct(33);
}
 

}
