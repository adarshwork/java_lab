//Lab-3: Implement the concept of Control statements and Arrays
//Domain: Concept Implementation System
//Implementation of the above mentioned concepts with examples
import java.io.*;
class details
{
	String col, col_eg;
	details(String colr,String col_e)
	{
		col=colr; 
		col_eg=col_e;
	}
	public void display()
	{
		System.out.println("Colour name: " + col  + "  " + "Colour example: " + col_eg);
	}
}
class conarr
{
	public static void main(String args[]) throws IOException
	{	
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Control Statements");
		System.out.println("Concept id: 201");
		System.out.println("Concept name: if..else if");
		System.out.println("Concept type: Decision Making Statements");
		System.out.println("Concept additional information: Determine which Statement to execute");
		System.out.println("\nExample\n");
		System.out.print("Enter a no. to know the range it falls in: ");
		int n1=Integer.parseInt(reader.readLine());
		if (n1>=0 && n1<=50)
		{
			System.out.println("You have entered a no. between 1-50");
		}
		else if (n1 > 50)
		{
			System.out.println("You have entered a no. > 50");
		}
		else
		{
			System.out.println("You have entered a no. < 0");
		}

		System.out.println("\nConcept id: 202");
		System.out.println("Concept name: switch");
		System.out.println("Concept type: Decision Making Statements");
		System.out.println("Concept additional information: Execute a single statement from multiple conditions.");
		System.out.println("\nExample\n");
		System.out.print("Enter a no. to see the equivalent day of week: ");
		int n2=Integer.parseInt(reader.readLine());
		switch(n2)
		{
			case 1: System.out.println("Day 1 is Monday");
					break;
			case 2: System.out.println("Day 2 is Tuesday");
					break;
			case 3: System.out.println("Day 3 is Wednesday");
					break;
			case 4: System.out.println("Day 4 is Thursday");
					break;
			case 5: System.out.println("Day 5 is Friday");
					break;
			case 6: System.out.println("Day 6 is Saturday");
					break;
			case 7: System.out.println("Day 7 is Sunday");
					break;
			default: System.out.println("There's only 7 days in a week.");
					break;
		}

		System.out.println("\nConcept id: 203");
		System.out.println("Concept name: for loop");
		System.out.println("Concept type: Iteration Statements");
		System.out.println("Execute a set of statement repeatedly until a condition is satisfied.");
		System.out.println("\nConcept id: 210");
		System.out.println("Concept name: Array");
		System.out.println("Concept type: Reference");
		System.out.println("Store multiple values of same type in a single variable");
		System.out.println("\nExample for for loop and Arrays\n");

		details co[]=new details[50];
		int i, size;
		String col="", col_eg="";
		System.out.print("Enter the size of array: ");
		size=Integer.parseInt(reader.readLine());
		for(i = 0; i < size; i++)
		{	
			System.out.print("\nEnter the Colour " +(i+1) + ": ");
			col=reader.readLine();
			System.out.print("Enter an example for that Colour " +(i+1) + ": ");
			col_eg=reader.readLine();
			co[i]=new details(col, col_eg);
		}
		System.out.println("\nColour Details:\n");
		for(i = 0; i < size; i++)
		{	
			co[i].display();
		}		
	}
}