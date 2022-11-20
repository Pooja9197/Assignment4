
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int m=13;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if((i>=j|| i==n-1) ||(j-i==m-1/2 || i+j==m-1/2 || j==0 || j==m-1 || i==j ))
				
				{ 
				System.out.print("*");
				}
				else
				{
					if(j>11 )
						{//System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
	}


	
	}

