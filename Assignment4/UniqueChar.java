
public class UniqueChar {

	public static void main(String[] args) {
		// WAP to write for unique string
		String name="tanmay";
		
		
		for(int i=0; i<name.length()-1; i++)
		{
			if(name.charAt(i)==name.charAt(i+1))
			{
				System.out.println("it contains all the unique character");
				
				
			}
			else
			{
				System.out.println("The string does not contain unique character");
			}
			break;
		}
	}
}
	


