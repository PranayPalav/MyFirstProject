package oops;

// class main is a part of an aggregation demo
public class aggregationdemo {
	main m;
	public int display(main m){
	return m.k*m.n;
	}
	public static void main(String[] args) {
		main m1=new main(34, 22);
		aggregationdemo a=new aggregationdemo();
		System.out.println(a.display(m1));		
	}
 
}
