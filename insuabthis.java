//Implement the concept of 'inheritance', 'super', 'abstract' and 'this' keywords in java.
//Domain: Concept Implementation System
//Implementation of Airline Flight Status Check
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Date;  

abstract class parent
{
	abstract int status_gen();

	parent()
	{
			System.out.println("Hold on.....");
	}

}
class insuabthis extends parent
{	
	static String source, dest, date;
	static int choice, ch, status;
	static
	{
			System.out.println("2047203 - ADARSH JHUNJHUNWALA");
			System.out.println("\nConcept id: 1001.2");
			System.out.println("Concept name: AIRLINE FLIGHT STATUS");
			System.out.println("Concept type: Status Check");
			System.out.println("Concept additional information: Check status of flights.");
			System.out.println("\nExample:");
			System.out.println("\nIT AIRLINE");	
	}

	insuabthis()
	{
			super();
	}

	insuabthis(String source, String dest, String date)
	{
			this.source=source;
			this.dest=dest;
			this.date=date;
	}
	public static void main(String args[]) throws IOException
	{
			insuabthis obj=new insuabthis();
			BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

			String[] fl_list= {"Indigo SE-123", "SpiceJet SE-321", "GoAir GA-290", "AirAsia AA-209", "Air India AI-872"};
			String[] loc={"BLR", "CCU", "DEL", "BOM", "MAA"} ;
			String[] fl_status= {"Check-in", "Boarding", "Airborne", "Landed", "Cancelled", "No info"};
			List<String> locs = new ArrayList<>(Arrays.asList(loc));
			System.out.print("\nEnter the source: ");
			source=reader.readLine();

			if(!locs.contains(source.toUpperCase()))
			{
				System.out.println("Invalid input/Location not available yet.");
				main(null);
			}

			System.out.print("\nEnter the destination: ");
			dest=reader.readLine();

			if(!locs.contains(dest.toUpperCase()))
			{
				System.out.println("Invalid input/Location not available yet.");
				main(null);
			}

			if(dest.toUpperCase().equals(source.toUpperCase()))
			{
				System.out.println("Source and Destination cannot be the same!");
				main(null);				
			}

			System.out.print("\nEnter the date: ");
			date=reader.readLine();

			if (!isValid(date))
			{
				System.out.println("Invalid date!");
				main(null);
			}

			insuabthis in=new insuabthis(source, dest, date);
		
			System.out.println("Available flights on " + date + ":\n");
			for(int i=0; i<fl_list.length; i++)
			{
				System.out.print(i + 1 + ".");
				System.out.print(fl_list[i]);
				System.out.print("\n");
			}
			System.out.print("Enter your choice to check status: ");
			choice=Integer.parseInt(reader.readLine());
			if(!(choice>=1 && choice<=5))
			{
				System.out.println("Invalid choice.");
				main(null);
			}
			status=obj.status_gen();
			System.out.println("            ");
			System.out.println("\nSource    Destination    Date        Status");
			System.out.println(source.toUpperCase() + "       " + dest.toUpperCase() + "            " + date + "  " + fl_status[status]);
			System.out.println();
			System.out.println("\nThanks for using our service. Have a great day!");
			System.out.print("\nDo you want to check another Flight's Status?\nEnter 1 to continue\nEnter 0 to Exit\nEnter your choice: ");
			ch=Integer.parseInt(reader.readLine());
			if(ch==1)
			{
				main(null);
			}
			else
			{
				System.out.println("Thanks for using our service. Have a great day!");
				System.exit(0);
			}
	} 

	public static boolean isValid(String text) 
	{
		    if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
		        return false;
		    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		    df.setLenient(false);
		    try
		    {
		        df.parse(text);
		        Date date = new Date(); 
		        if(df.parse(text).before(date))
		        	return false;
		        return true;
		    } 
		    catch (ParseException ex)
		    {
		        return false;
		    }
	}

	int status_gen()
	{
			double r= Math.random()*10;
		    int st=(int) r;
		    if (st>6)
		    	st=6;
		    else if (st==0)
		    	return 0;
		    return st-1;  
	}

}