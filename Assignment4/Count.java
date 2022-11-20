
public class Count {
//WAP to count vowels,consonants, digits, special char//
	public static void main(String[] args) {
		String name= "Iteratione**#1";
		name= name.toLowerCase();
		int vowels=0, consonants=0, digit=0, specialChar=0;
		int count=0;
		for(int i=0; i< name.length(); i++)
		{
			if((name.charAt(i)>='a' && name.charAt(i)<='z') || (name.charAt(i)>='A' && name.charAt(i)<='Z'))
			{
			if(name.charAt(i)== 'a' || name.charAt(i)== 'e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
			{
				vowels++;
				
			}
			else
				consonants++;
			
			}
			else if(name.charAt(i)=='0' || name.charAt(i)=='1' || name.charAt(i)=='2' || name.charAt(i)=='3' || name.charAt(i)=='4'
					|| name.charAt(i)=='5' || name.charAt(i)=='6' || name.charAt(i)=='7' || name.charAt(i)=='8' || name.charAt(i)=='9')
			{
			digit++;
			
			}
			else
				specialChar++;
			
			}
		System.out.println("No of vowels are:" + vowels );
		System.out.println("No of consonants are:" + consonants );
		System.out.println("No of digits are:" + digit);
		System.out.println("No of special char:" + specialChar);
		}
	
	}
	

