//Implement the concept of class, data members, member functions and access specifiers.
//Domain: Concept Implementation System
//Implementation of the above mentioned concepts with examples
import java.io.*;
class parent
{
	
	public static int n3, n4;
	protected static int n5, n6;	
}
class oopbasic extends parent
{	
	private static int n1, n2;
	public static void main(String args[]) throws IOException
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");

		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		int num1, num2;
		
		System.out.println("Concept id: 101");
		System.out.println("Concept name: Class");
		System.out.println("Concept type: User defined");
		System.out.println("Concept additional information: Blueprint of object");
		System.out.println("\nExample:");
		System.out.println("\nNumber operations will be performed inside this class.");

		System.out.println("\nConcept id: 111");
		System.out.println("Concept name: Data Members");
		System.out.println("Concept type: Inbuilt or User defined");
		System.out.println("Concept additional information: Used for various operations");

		System.out.println("\nConcept id: 112");
		System.out.println("Concept name: Member Functions");
		System.out.println("Concept type: Inbuilt or User defined");
		System.out.println("Concept additional information: Set of statements used to perform various operations");

		System.out.println("\nConcept id: 121");
		System.out.println("Concept name: Access Specifiers");
		System.out.println("Concept type: Inbuilt");
		System.out.println("Concept additional information: Specifies the accessibility or scope of a field, method, constructor, or class");
		
		System.out.println("\nExample for Data members, Member functions and Access Specifiers");

		//default
		System.out.println("\nDefault modifier operation");
		System.out.print("\nEnter a no.: ");
		num1=Integer.parseInt(reader.readLine());	
		System.out.print("Enter another no.: ");
		num2=Integer.parseInt(reader.readLine());
		System.out.println("Sum of " + num1 + " and " + num2 + ": " + (num1+num2));


		//private
		System.out.println("\n\nPrivate modifier operation");
		System.out.print("\nEnter a no.: ");
		n1=Integer.parseInt(reader.readLine());
		System.out.print("Enter another no.: ");
		n2=Integer.parseInt(reader.readLine());
		System.out.println("Product of " + n1 + " and " + n2 + ": " + n1*n2);
 
		//public
		System.out.println("\nPublic modifier operation");
		System.out.print("\nEnter a no.: ");
		n3=Integer.parseInt(reader.readLine());
		System.out.print("Enter another no.: ");
		n4=Integer.parseInt(reader.readLine());
		System.out.println("Largest of " + n3 + " and " + n4 + ": " + checkLarge());

		//protected
		System.out.println("\nProtected modifier operation");
		System.out.print("\nEnter a no.: ");
		n5=Integer.parseInt(reader.readLine());
		System.out.print("Enter another no.: ");
		n6=Integer.parseInt(reader.readLine());
		System.out.println("Largest of " + n5 + " and " + n6 + ": " + checkSmall());		
	}

	static int checkLarge()
	{
		int l=n3>n4?n3:n4;
		return l;
	}

	static int checkSmall()
	{
		int s=n5<n6?n5:n6;
		return s;
	}
}