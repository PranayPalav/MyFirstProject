package demoooo;

import java.util.Scanner;

public class switchcase_demo {
	public static void main(String args[]){
//		int a,b,c,d;
//		Scanner s=new Scanner(System.in);
//		a=s.nextInt();
//		b=s.nextInt();
//		c=s.nextInt();
//		switch(a) {
//		case 1:
//			d=c+b;
//			System.out.println(d);
//			break;
//		case 2:
//			d=c-b;
//			System.out.println(d);
//			break;
//		default:
//			break;
//		}
		
		
		
		String a;
		int d,b,c;
		Scanner i=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		b=i.nextInt();
		a=s.next();
		c=i.nextInt();
		switch(a){
		case "+":
			d=b+c;
			System.out.println(d);
			break;
			
		case "-":
			d=b-c;
			System.out.println(d);
			break;
			
		case "/":
			d=b/c;
			System.out.println(d);
			break;
			
		case "*":
			d=b*c;
			System.out.println(d);
			break;
			
		case "off":
			break;
		}
		
	}

}
