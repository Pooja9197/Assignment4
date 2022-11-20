
public class MaxChar {

	public static void main(String[] args) {
		// WAP to find the maximum occurring character in a String.
           String name="anushaka";
           int count=0;
           for(int i=0; i<name.length()-1;i++)
           {
        	   for(int j=0; i<name.length()-1;j++)
        	   {
        	   if(name.charAt(i)==name.charAt(j))
        	   {
        		   count++;
        	   }
        		           	System.out.println("No of MaxChar are:" + count );
           }
           

	}

}
}