//Implement the concept of function overloading & Constructor overloading.
//Domain: Concept Implementation System
//Implementation of the above mentioned concepts with examples
import java.io.*;
class overload
{	
	public static void main(String args[]) throws IOException
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		int n1, n2, n5, n6;
		float n3, n4, n7, n8;
		System.out.println("\nConcept id: 130");
		System.out.println("Concept name: Function Overloading");
		System.out.println("Concept type: User defined");
		System.out.println("Concept additional information: Functions with same name to peform different operation");
		System.out.println("\nExample:");
		System.out.print("\nEnter a no.: ");
		n1=Integer.parseInt(reader.readLine());
		System.out.print("Enter another no.: ");
		n2=Integer.parseInt(reader.readLine());
		opr(n1, n2);
		System.out.print("\nEnter a no.: ");
		n3=Float.parseFloat(reader.readLine());
		System.out.print("Enter another no.: ");
		n4=Float.parseFloat(reader.readLine());
		opr(n3, n4);
		System.out.println("\nConcept id: 140");
		System.out.println("Concept name: Constructor Overloading");
		System.out.println("Concept type: User defined");
		System.out.println("Concept additional information: Constructor with same name to peform different operation");
		System.out.println("\nExample:");
		System.out.print("\nEnter a no.: ");
		n5=Integer.parseInt(reader.readLine());
		System.out.print("Enter another no.: ");
		n6=Integer.parseInt(reader.readLine());
		overload o1=new overload(n5, n6);
		System.out.print("\nEnter a no.: ");
		n7=Float.parseFloat(reader.readLine());
		System.out.print("Enter another no.: ");
		n8=Float.parseFloat(reader.readLine());
		overload o2=new overload(n7, n8);

	}
	static void opr(int n1, int n2)
	{
		System.out.println("Sum of " + n1 + " and " + n2 + ": " + (n1+n2));
	}
	static void opr(float n3, float n4)
	{
		System.out.println("Difference of " + n3 + " and " + n4 + ": " + (n3-n4));
	}
	overload(int n5, int n6)
	{
		System.out.println("Product of " + n5 + " and " + n6 + ": " + (n5*n6));
	}
	overload(float n7, float n8)
	{
		System.out.println("Quotient of " + n7 + " and " + n8 + ": " + (n7/n8));
	}
}
