//Implement the static keyword – static variable, static block, static function and static class
//Domain: Concept Implementation System
//Implementation of the above mentioned concepts with examples
import java.io.*;
class stat
{	
	static int n1;
	static
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		System.out.println("\nConcept id: 303");
		System.out.println("Concept name: Static Block");
		System.out.println("Concept type: Static");
		System.out.println("Concept additional information: Initialize static members and it is executed before the main method at the time of classloading.");
		System.out.println("\nExample:");
		System.out.println("Random Number of the Day: " + Math.random()*1000);

	}
	public static void main(String args[]) throws IOException
	{
		System.out.println("\nConcept id: 304");
		System.out.println("Concept name: Static Class");
		System.out.println("Concept type: Static");
		System.out.println("Concept additional information: Can access only the static members of the outer class.");
		stat.inside si=new stat.inside();
		si.operation();

	} 
	static void increment(int n2, int i)
	{
		n1++;
		n2++;
		System.out.print("\nValue of n1: " + n1 + " and Value of n2: " + n2 + " after Increment " + i);
	}
	static class inside
	{
		void operation() throws IOException
		{
			BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
			int n, n2;
			System.out.println("\nConcept id: 301");
			System.out.println("Concept name: Static Variable");
			System.out.println("Concept type: Static");
			System.out.println("Concept additional information: Used to refer to the common property of all objects");
			System.out.println("\nConcept id: 302");
			System.out.println("Concept name: Static Method");
			System.out.println("Concept type: Static");
			System.out.println("Concept additional information: Access static data member and can change the value of it.");
			System.out.println("\nExample for Static Class, Static Variable and Static Method:");
			System.out.print("\nEnter a no.: ");
			n1=Integer.parseInt(reader.readLine());
			System.out.print("Enter another no.: ");
			n2=Integer.parseInt(reader.readLine());
			System.out.print("Enter the no. of required increments: ");
			n=Integer.parseInt(reader.readLine());
			for(int i=1; i<=n; i++)
			{
				increment(n2, i);
			}

		}		

	}
}