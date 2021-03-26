import java.util.Arrays;
import java.util.Scanner;
public class palindrome
{
   public static void main(String[] args) 
   {
   	  System.out.println("2047203 - ADARSH JHUNJHUNWALA");
      System.out.print("Enter a string: ");
      Scanner s= new Scanner(System.in);
      String str= s.nextLine();
      char[] chArray = str.toCharArray();
      int size = chArray.length;
      char[] chGiven = Arrays.copyOf(chArray, chArray.length);
      for(int i = 0; i < size / 2; i++) 
      {
         char temp = chArray[i];
         chArray[i] = chArray[size - i - 1];
         chArray[size - i - 1] = temp;
      }
      System.out.println("Without using Inbuilt method");
      if(Arrays.equals(chArray, chGiven)) 
         System.out.println(str + " is palindrome.");
      else 
         System.out.println(str + " is not palindrome.");
     //Using Inbuilt method
      String rev="";
      int length = str.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 	  System.out.println("\nUsing Inbuilt method");
      if (str.equals(rev))
         System.out.println(str + " is palindrome.");
      else
         System.out.println(str + " is not palindrome.");    	
   }
}