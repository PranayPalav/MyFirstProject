package oops;
abstract class CALCULATOR2{
	abstract void addition(int a,int b);
	abstract void subtraction(int a,int b);
}

 abstract class ADDITION extends CALCULATOR2{
	int c;
	abstract void addition1(int a, int b);
		
	
 }
 class addi extends ADDITION {
	 public void addition(int a, int b){
			c=a+b;
			System.out.println(c);
			
		}
	 public void subtraction(int a, int b){
			c=a-b;
			System.out.println(c);
			
		}
	 public void addition1(int a, int b){
			c=a+b;
			System.out.println(c);
			
		}
	 
 }
public class abstractiondemo2 {
public static void main(String[] args) {
	//Add1 a=new Add1();
//	a.subtraction(22, 33);
	addi ab=new addi();
	ab.addition(22, 44);
	ab.subtraction(66, 12);
	ab.addition1(23, 56);
}
}
