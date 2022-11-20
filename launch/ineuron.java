
public class ineuron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
		
		for(int i=0;i<n; i++)
		{
			for(int j=0 ; j<n; j++)
			{
				// to print i
				if((i==0) ||
						(i==n-1 ||
						
						(j==n/2)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			//to print N
			
			for(int j=0 ; j<n; j++)
			{
				if((j==1 || j==8 || i==j))
		
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			//to print E
			for(int j=0 ; j<n; j++)
			{
				if(i==0 && j>0 && j<(3*n)/4  || j==0 && i>0 && i<n-1 
						|| i==n-1 && j>0 && j<(3*n)/4 || i==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
				
			}
			//to print U
			for(int j = 0; j < n; j++) {  
                if(((j==0 || i == n - 1) && j >= 0 && j < n - 1)) {  
                    System.out.printf("*");  
                }else if(j == n - 1 && i != 0 && i != n - 1){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
		           
		 // to print R
	            for(int j = 0; j < n; j++) {  
	                if((i == 0 || j==0 || i == n/2) && j < (n - 2)) {  
	                
	                    System.out.printf("*");  
	                }else if(j == (n - 2) && !(i == 0 || i == n/2)){  
	                    System.out.print("*");  
	                }else {  
	                    System.out.print(" ");  
	                }  
	            }  
	           for(int j=1;j<=n;j++) {
	        	   if((i==1 & j>=2 & j<=4) || (j==1 & i>=2 & i<=4) || (j==5 & i>=2 & i<=4) || (i==5 & j<=4 & j>=2))
	        	   { System.out.print(" *"); 
	        	   }
	           else {
	        	   System.out.print(" ");
	           }
	           }

				//for(int j=1 ; j<n; j++)
				//{
					//if((j==1 || j==8 || i==j))
			
					//{
					//	System.out.print("*");
				//	}
					//else
					//{
				//		System.out.print(" ");
						
				//	}
					
			//	}
	           
	            System.out.println();
			}
			
		}

	}


        



	



	
