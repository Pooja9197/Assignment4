
public class Duplicate {

	public static void main(String[] args) {
		//WAP to print duplicate char in string
		String name= "pooja"; 
		
		for(int i=0; i<name.length()-1; i++)
		{
			
			
			if(	name.charAt(i)==name.charAt(i+1))
			{
				System.out.println("The duplicate char is:" +name.charAt(i));
			}
			
			else
			{
		System.out.println("it has no duplicte");
	}

}
	}
	}
	


