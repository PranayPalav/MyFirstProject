package oops;


public class aggrigation2 {
	main2 m1;
	
	public int display1(main2 m1){
		return m1.j/m1.k;
	}
	//main2 is a part of an aggrigation2
	public static void main(String[] args) {
		main2 m2=new main2(45, 12);
		aggrigation2 ag=new aggrigation2();
		System.out.println(ag.display1(m2));
	}

}
