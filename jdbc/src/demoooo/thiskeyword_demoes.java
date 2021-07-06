package demoooo;

public class thiskeyword_demoes {
	int a=20,c;
	public int display(int b)
	{
		System.out.println(this.a);
		c=b+this.a;
		System.out.println(c);
		return b;
	}
	public int display1(int d){
		return d+this.display(33);
	}
//	static{
//		this.display(33);    // cannot used in static context
//	}
	public static void main(String args[]){
thiskeyword_demoes td=new thiskeyword_demoes();
// this.display(33);         // cannot used in static context
System.out.println(td.display(22));	
System.out.println(td.display1(44));
	}

}
