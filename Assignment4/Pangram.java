
public class Pangram {

	public static void main(String[] args) {
		// WAP for pangram
        String name="A quick brwon fox jumps over the lazy dog";
        name.toLowerCase();
        for(int i=0; i<name.length()-1;i++)
        {
        	if((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z'))
        	{
        		System.out.println("the letters given are anagram");
        	}
        	     		
        	
        }
	}

}
