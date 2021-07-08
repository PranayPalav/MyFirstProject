package demoooo;

public class triangle_pattern {
	public static void main(String args[]){
		int n=5,count=1 ,count1=n-1,count2=count1;
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
		
		
		
		
		
		
		
	}

}
