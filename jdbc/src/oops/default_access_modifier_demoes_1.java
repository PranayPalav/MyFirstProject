package oops;

 // class default_access_modifier_demoes_1 {  // if u declare default class then it is accessible within package only
public class default_access_modifier_demoes_1 {
	public void display1(int n){
		int count=1;
		for(int j=1;j<=n;j++){
			for(int i=1;i<=j;i++){
				System.out.print(count);
             if(count<=10){
            	 System.out.print("   ");
             }else{
            	 System.out.print("  ");
             }
				count++;
			}
			System.out.println();
			}
		
//		for(int j=1;j<=n;j++){
//			for(int i=1;i<=j;i++){
//				System.out.print("*");
//				System.out.print(" ");
//			}
//			System.out.println(" ");
//			}
	}
	public void display(int n){
		for(int j=1;j<=n;j++){
		for(int i=1;i<=j;i++){
			if(j%2==0){
				System.out.print("#");
			}else{
			System.out.print("*");
			}
		}
		System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		default_access_modifier_demoes_1 dam=new default_access_modifier_demoes_1();
		dam.display(5);
		dam.display1(6);
	}
}
