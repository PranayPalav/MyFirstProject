package demoooo;

public class demo5 {
	
	//if u notdeclared any value then compiler written its default value string=null and int=0
	String name;
	int id;
	public static void main(String args[]){
		demo5 d=new demo5();
		System.out.println(d.name);
		System.out.println(d.id);
		System.out.println("get second data");
		demo5 d1=new demo5();
		System.out.println(d1.name);
		System.out.println(d1.id);
		
		demo5 d2= new demo5();
		System.out.println(d2.id=2);
		System.out.println(d2.name="praful");
		
	}

}
