package oops;
class dis1{
	public void hii(int t){
		System.out.println(t);
	}
}
class B1 extends dis1{
	public String name(String name){
		return name;
	}
}
class c1 extends dis1{
	public int salary(int income){
		return income;
	}
	
}
public class hirarichalinhritance {
	public static void main(String[] args) {
		c1 c11= new c1();
		c11.hii(3);
		System.out.println(c11.salary(33333));
		B1 b1=new B1();
		b1.hii(4);
		System.out.println(b1.name("chotu"));
		
	}

}
