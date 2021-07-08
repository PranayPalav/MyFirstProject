package demoooo;

public class kite_pattern {
	public static void main(String args[]){
	
		int n=5,count=1 ,count1=n-1,count2=1;
		for(int i=1;i<=n;i++){
			for(int k=1;k<=n-i;k++){
				
				System.out.print(" ");
				
			}
			if(i>1){
			for(int j=1;j<=i+count;j++){
				
					
					System.out.print("*");
			}
			count++;
			}else{
              for(int z=1;z<=i;z++){
				
					
					System.out.print("*");
			}
				
				
			}
			
			System.out.println();
		}
		
	
	
	
	
//	for(int i=5;i>0;i--){
//		for(int k=1;k<=count2;k++){
//			System.out.print(" ");
//		}
//	 for(int j=(2*(i-1)-1);j>0;j--){
//		 System.out.print("*");
//	 }
//	count2++;
//	 System.out.println();
//		
//	}
		
		
//  or 
		
		for(int i=5;i>0;i--){
			for(int k=i-1;k<=n-1;k++){
				System.out.print(" ");
			}
		 for(int j=(2*(i-1)-1);j>0;j--){
			 System.out.print("*");
		 }
		
		 System.out.println();
			
		}
	}

}
