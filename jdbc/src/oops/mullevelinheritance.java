package oops;



class dis{
	public void hii(int t){
		System.out.println(t);
	}
}
class B extends dis{
	public String name(String name){
		return name;
	}
}
class c extends B{
	public int salary(int income){
		return income;
	}
	
}

public class mullevelinheritance {
	public static void main(String[] args) {
		c c1=new c();
		c1.hii(3);
System.out.println(c1.name("pranay"));
	System.out.println(c1.salary(2000));
		
	}
}
