package oops;

 // class default_access_modifier_demoes_1 {  // if u declare default class then it is accessible within package only
public class default_access_modifier_demoes_1 {
	public void display(int n){
		for(int j=1;j<=n;j++){
		for(int i=1;i<=j;i++){
			System.out.print("*");
		}
		System.out.println();
		}
	}
	public static void main(String args[])
	{
		default_access_modifier_demoes_1 dam=new default_access_modifier_demoes_1();
		dam.display(5);
	}
}
