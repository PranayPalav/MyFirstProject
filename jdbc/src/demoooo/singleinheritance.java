package demoooo;
class inherit{
	int p,o;
	String name1;
public void display(){
	System.out.println("single inheritance");
}
public inherit() {
	// TODO Auto-generated constructor stub
	System.out.println("inheritance demo");
}
public  inherit(int j,int k,String name){
	this.p=j;
	this.o=k;
	this.name1=name;
}
}

public class singleinheritance extends inherit {
	public void data( inherit si){
		System.out.println(si.o+si.o);
		System.out.println(si.name1);
		
	}
	public static void main(String args[]){
		singleinheritance si1=new singleinheritance();
		
		si1.display();
		inherit i=new inherit(6, 7, "palav");
		si1.data(i);
		
	}

}
