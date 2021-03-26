import java.io.*; 
class concept
{
	void display(int c_id, String c_name, String c_type, String c_add_info) throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		int ch;
		System.out.println("Concept id: " + c_id);
		System.out.println("Concept name: " + c_name);
		System.out.println("Concept type: " + c_type);
		System.out.println("Concept additional information: " + c_add_info);
		System.out.print("Do you want to modify any entered information? Enter 1 for yes, 0 to exit.\nEnter your choice: ");
		ch=Integer.parseInt(reader.readLine()); 
		if(ch==1)
		{
			modify(c_id,c_name, c_type, c_add_info);	
		}
		else
		{	
			System.out.println("Program will now exit.");
			System.exit(0);	
		}

	}
	void modify(int c_id, String c_name, String c_type, String c_add_info) throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Concept id: ");
		c_id=Integer.parseInt(reader.readLine()); 
		System.out.print("Enter the Concept name: ");
		c_name=reader.readLine(); 		
		System.out.print("Enter the Concept type: ");
		c_type=reader.readLine(); 
		System.out.print("Enter additional information for the Concept: ");
		c_add_info=reader.readLine(); 	
		display(c_id,c_name, c_type, c_add_info);	
	}
	public static void main(String args[]) throws IOException
	{
	    System.out.println("2047203 - ADARSH JHUNJHUNWALA");
	    concept c=new concept();
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		int c_id, choice;
		String c_name, c_type, c_add_info="NULL";
		System.out.print("Enter the Concept id: ");
		c_id=Integer.parseInt(reader.readLine()); 
		System.out.print("Enter the Concept name: ");
		c_name=reader.readLine(); 		
		System.out.print("Enter the Concept type: ");
		c_type=reader.readLine(); 
		System.out.print("Do you have any additional information regarding the Concept? Enter 1 for yes, 0 for no.\nEnter your choice: ");
		choice=Integer.parseInt(reader.readLine()); 
		if(choice==1)
		{
			System.out.print("Enter additional information for the Concept: ");
			c_add_info=reader.readLine(); 	
			c.display(c_id,c_name, c_type, c_add_info);	
		}
		else if(choice==0)
		{
			c.display(c_id,c_name, c_type, c_add_info);
		}
		else
		{
			System.out.println("Invalid choice. Program will now exit.");
			System.exit(0);
		}
	}

}