package oops;
abstract class calculator1{
	abstract void addition(int a,int b);
	//abstract void subtraction(int a,int b);
}

 class Add1 extends calculator1{
	int c;
	public void addition(int a, int b){
		c=a+b;
		System.out.println(c);
		
	}
}
public class abstractiondemo1 {
	public static void main(String[] args) {
		Add1 a=new Add1();
		a.addition(22, 33);
	}

}
