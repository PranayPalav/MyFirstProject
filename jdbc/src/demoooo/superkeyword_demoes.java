package demoooo;
//for super keyword inheritance is neccessary
//super means parent 
//bassically super is reference variable, used to refere parent class instance variable or object



class superdemo{
	int a=20;
	public int display(int a){
		return a;
	}
}
public class superkeyword_demoes extends superdemo {
	public void display1(){
	 int c=super.a+super.display(22)+display(33);
	 System.out.println(c);
	}
	public void display2(){
		System.out.println(super.display(33));
	
	}
	public static void main(String args[]){
		
		superkeyword_demoes sk=new superkeyword_demoes();
sk.display1();
sk.display2();}

}
