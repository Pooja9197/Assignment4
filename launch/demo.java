
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i>=j|| i==n-1) ||(j-i==n-1/2 || i+j==n-1/2 || j==0 || j==n-1 || i==j ))
				
				{ 
				System.out.print("*");
				}
				else
				{
					if(j>11 || j>3*n/4)
						{System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
	}


	
	


	}


