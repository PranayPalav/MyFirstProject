package demoooo;

public class overload_mainmethod {
	public static void main(int i){
		System.out.println("u can overload main method by this way");
		System.out.println(i);
	}
	public static void main(String args[]){
		overload_mainmethod m=new overload_mainmethod();
		m.main(22);
		
	}

}
