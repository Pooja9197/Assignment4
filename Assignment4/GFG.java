

	import java.util.*;
	  
	class GFG 
	{
	    static String removeDuplicate(char str[], int n)
	    //WAP to remove Duplicates from a String
	    {
	        
	        int index = 0;
	  
	        
	        for (int i = 0; i < n; i++)
	        {
	  
	            
	            int j;
	            for (j = 0; j < i; j++) 
	            {
	                if (str[i] == str[j])
	                {
	                    break;
	                }
	            }
	  
	            
	            if (j == i) 
	            {
	                str[index++] = str[i];
	            }
	        }
	        return String.valueOf(Arrays.copyOf(str, index));
	    }
	  
	   
	    public static void main(String[] args)
	    {
	        char str[] = "onforonfor".toCharArray();
	        int n = str.length;
	        System.out.println(removeDuplicate(str, n));
	    }
	}

