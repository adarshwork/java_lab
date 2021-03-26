//Implement the static keyword – static variable, static block, static function and static class
//Domain: Concept Implementation System
//Implementation of the above mentioned concepts with examples
import java.io.*;
class stat2
{	
	static String date, source, dest, name;
	static int fl_select, choice;
	static long ph;
	static
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		System.out.println("\nConcept id: 1001");
		System.out.println("Concept name: AIRLINE RESERVATION");
		System.out.println("Concept type: Booking");
		System.out.println("Concept additional information: Book airline tickets.");
		System.out.println("\nExample:");
		System.out.println("\nIT AIRLINE RESERVATION");

	}
	public static void main(String args[]) throws IOException
	{
		stat2.inside si=new stat2.inside();
		si.operation();
	} 
	static void pnr_gen() throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		double r= Math.random()*1000000;
	    int pnr=(int) r;
	    int ch;
		System.out.println("PNR: " + pnr);
		System.out.println("\nHave a Happy & Safe Journey");
		inside in=new inside();
		System.out.print("\nEnter 1 to make another booking\nEnter 0 to Exit\nEnter your choice: ");
		ch=Integer.parseInt(reader.readLine());
		if(ch==1)
		{
			in.operation();
		}
		else
		{
			System.out.println("Thanks for using our service. Have a great day!");
			System.exit(0);
		}
	}
	static class inside
	{
		void operation() throws IOException
		{
			BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\nEnter the source: ");
			source=reader.readLine();
			System.out.print("\nEnter the destination: ");
			dest=reader.readLine();
			System.out.print("\nEnter the date: ");
			date=reader.readLine();
			System.out.println("Flights available between " + source + " and " + dest + " on " + date + "");
			System.out.println("Sl	Flight name/no.			Departure		Arrival		Fare (in Rs.)");
			System.out.println("1	Indigo 6E-123			20:00			22:30		10,000");
			System.out.println("2	SpiceJet SG-321			15:00			19:30		10,250");
			System.out.println("3	GoAir GA-290			10:00			12:30		11,500");
			System.out.println("4	AirAsia AA-209			07:00			10:30		15,000");
			System.out.println("5	Air India AI-872		04:00			18:30		16,600");
			System.out.print("\nEnter the respective Sl number to continue booking: ");
			fl_select=Integer.parseInt(reader.readLine());
			if(fl_select < 1 || fl_select > 5)
			{
				System.out.println("Invalid selection!");
				operation();
			}
			System.out.print("Enter your full name: ");
			name=reader.readLine();
			System.out.print("Enter your Contact no: ");
			ph=Long.parseLong(reader.readLine());
			System.out.print("\nDo you want to confirm your booking?\nEnter 1 for Yes, 0 for No.: ");
			choice=Integer.parseInt(reader.readLine());
			if(choice == 1)
			{	
				switch(fl_select)
				{
					case 1: System.out.println("Congratulations! Your flight has been successfully booked.\nHere are the details:");
							System.out.println("\nPassenger name: " + name);
							System.out.println("Contact no.: " + ph);
							System.out.println("Source: " + source);
							System.out.println("Destination: " + dest);
							System.out.println("Date: " + date);
							System.out.println("Flight name/no: Indigo 6E-123");
							System.out.println("Departure: 20:00");
							System.out.println("Arrival: 22:30");
							System.out.println("Booking Amount: Rs.10,000");
							pnr_gen();
							break;
					case 2: System.out.println("Congratulations! Your flight has been successfully booked.\nHere are the details:");
							System.out.println("\nPassenger name: " + name);
							System.out.println("Contact no.: " + ph);
							System.out.println("Source: " + source);
							System.out.println("Destination: " + dest);
							System.out.println("Date: " + date);
							System.out.println("Flight name/no: SpiceJet SG-321");
							System.out.println("Departure: 15:00");
							System.out.println("Arrival: 19:30");
							System.out.println("Booking Amount: Rs.10,250");
							pnr_gen();
							break;
					case 3: System.out.println("Congratulations! Your flight has been successfully booked.\nHere are the details:");
							System.out.println("\nPassenger name: " + name);
							System.out.println("Contact no.: " + ph);
							System.out.println("Source: " + source);
							System.out.println("Destination: " + dest);
							System.out.println("Date: " + date);
							System.out.println("Flight name/no: GoAir GA-290");
							System.out.println("Departure: 10:00");
							System.out.println("Arrival: 12:30");
							System.out.println("Booking Amount: Rs.11,500");
							pnr_gen();
							break;	
					case 4: System.out.println("Congratulations! Your flight has been successfully booked.\nHere are the details:");
							System.out.println("\nPassenger name: " + name);
							System.out.println("Contact no.: " + ph);
							System.out.println("Source: " + source);
							System.out.println("Destination: " + dest);
							System.out.println("Date: " + date);
							System.out.println("Flight name/no: AirAsia AA-209");
							System.out.println("Departure: 07:00");
							System.out.println("Arrival: 10:30");
							System.out.println("Booking Amount: Rs.15,000");
							pnr_gen();
							break;	
					case 5: System.out.println("Congratulations! Your flight has been successfully booked.\nHere are the details:");
							System.out.println("\nPassenger name: " + name);
							System.out.println("Contact no.: " + ph);
							System.out.println("Source: " + source);
							System.out.println("Destination: " + dest);
							System.out.println("Date: " + date);
							System.out.println("Flight name/no: Air India AI-872");
							System.out.println("Departure: 04:00");
							System.out.println("Arrival: 18:30");
							System.out.println("Booking Amount: Rs.16,600");
							pnr_gen();
							break;
					default:System.out.println("Thanks for using our service. Have a great day!");
							System.exit(0);
							break;																

				}
			}
			else
			{
				System.out.println("Thanks for using our service. Have a great day!");
			}

		}	

	}
}