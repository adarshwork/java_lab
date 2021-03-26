import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class numbertypes 
{
   static void isAnagram(String str1, String str2) 
   {  
        String s1 = str1.replaceAll("\\s", "");  
        String s2 = str2.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) 
        {  
            status = false;  
        } 
        else 
        {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status)
        {  
            System.out.println(s1 + " and " + s2 + " are anagrams.");  
        } 
        else 
        {  
            System.out.println(s1 + " and " + s2 + " are not anagrams.");  
        }
    }
    static boolean isAbecedarian(String str1)
    {
    	int index = str1.length() - 1;
		for (int i = 0; i < index; i++) 
		{
			if (str1.charAt(i) <= str1.charAt(i + 1)) 
			{

			}
			else 
			{
			    return false;
			}
		}
		return true;
   }
 	static void isDoubloon(String str)
	{
		String l=str.toLowerCase();
		boolean check = true;
		for(int i= 0; i<l.length();i++)
		{
		    int count=0;
		    for(int j=0;j<l.length();j++)
		    {
		        if(l.charAt(i)==l.charAt(j)) 
		        	count++;
		    }
		    if (count != 2) 
		    {
		        check = false;
		        break;
		    }
		}
		if(check==true)
		{
		    System.out.println(str + " is a Doubloon");
		}
		else
		{
		    System.out.println(str + " is not a Doubloon");
		}
	}
	public static void main(String args[]) throws IOException
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		String str1, str2;
		int choice;
		do
		{
			System.out.print("\nEnter 1 for Anagram checking\nEnter 2 for Abacederian checking\nEnter 3 for Doubloon checking\nEnter 4 to Exit\nEnter your choice: ");
			choice=Integer.parseInt(reader.readLine());
			switch(choice)
			{
				case 1: System.out.print("Enter a string: ");
						str1=reader.readLine();
						System.out.print("Enter another string: ");
						str2=reader.readLine();
						isAnagram(str1, str2);
						break;

				case 2: System.out.print("Enter a string: ");
						str1=reader.readLine();
						if(isAbecedarian(str1))
							System.out.println(str1 + " is Abecedarian.");
						else
							System.out.println(str1 + " is not Abecedarian.");
						break;
				case 3: System.out.print("Enter a string: ");
						str1=reader.readLine();
						isDoubloon(str1);
						break;
				case 4: System.out.println("Program will now exit");
						System.exit(0);
						break;
				default: System.out.println("Please enter a valid choice");
						 break;

			}
		}while(choice!=4);
	}
}
