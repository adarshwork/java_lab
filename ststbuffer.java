//Implement command-line arguments, String and String Buffer class methods. (minimum 2 String and String Buffer class methods)
//Domain: Concept Implementation System
//Implementation of Airline Meal Booking
import java.io.*;
import java.util.*;
class ststbuffer
{	
	static
	{
			System.out.println("2047203 - ADARSH JHUNJHUNWALA");
			System.out.println("\nConcept id: 1001.1");
			System.out.println("Concept name: AIRLINE MEAL");
			System.out.println("Concept type: Booking");
			System.out.println("Concept additional information: Book meals for flight.");
			System.out.println("\nExample:");
			System.out.println("\nIT AIRLINE MEAL BOOKING");
	}
	public static void main(String args[]) throws IOException
	{
			BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

			Scanner s = new Scanner(System.in);

			StringBuffer fname = new StringBuffer();
			StringBuffer lname = new StringBuffer();

			String pnr;
			String sel="Meal/Beverage Name: ";
			String[] meal_veg= {"Cheese Grilled Sandwich", "Paneer Noodles", "Veg Pasta"};
			int[] veg_price={100, 120, 150};
			String[] meal_nveg= {"Roast Chicken", "Chicken Chettinad", "Chicken Biriyani"};
			int[] nveg_price={150, 170, 200};
			String[] bev= {"Royal Tea", "Filter Coffee", "Tangy Lemonade"};
			int[] bev_price={70, 60, 50};
			int mealtype, vch, nvch, bevch, conf;
				
			int further=Integer.parseInt(args[0]);
			
			if(further!=1)
			{
				System.out.println("\nUser should have entered 1 to continue execution. The program will exit now!");
				System.exit(0);
			}
			
			System.out.print("\nEnter First name: ");
			fname.append(s.nextLine());
			fname.append(" ");
			fname.ensureCapacity(16);
			System.out.print("Enter Last name: ");
			lname.append(s.nextLine());
			fname.append(lname);
			fname.ensureCapacity(16); //ensures the capacity to at least equal to the specified minimumCapacity.
			//System.out.println("fname's Capacity: " + fname.capacity());
			System.out.print("Enter PNR: ");
			pnr=reader.readLine();

			if (pnr.length()!=6)
			{
				System.out.println("Enter a Valid PNR");
				String[] temp={"1"};//temporary variable to pass as cmd line argument 
				main(temp);//passing temp as argument for the main function call
			}

			do
			{
				System.out.print("\nCategories:\n1.Veg\n2.Non-Veg\n3.Beverage\n4.Exit\nEnter your choice: ");
				mealtype=Integer.parseInt(reader.readLine());

				switch(mealtype)
				{
					case 1: System.out.println("\nVeg Options:");

							for(int i=0; i<meal_veg.length; i++)
							{
								System.out.print(i + 1 + ".");
								System.out.print(meal_veg[i]);
								System.out.print("\n");
							}

							System.out.print("Enter your choice: ");
							vch=Integer.parseInt(reader.readLine());

							System.out.println("\nYou have selected:");
							if (vch==1)
							{
								System.out.println(sel.concat(meal_veg[0]));
								System.out.println("Price: Rs." + veg_price[0]);
								System.out.print("\n");
							}
							else if (vch==2)
							{
								System.out.println(sel.concat(meal_veg[1]));
								System.out.println("Price: Rs." + veg_price[1]);
								System.out.print("\n");
							}
							else if (vch==3)
							{
								System.out.println(sel.concat(meal_veg[2]));
								System.out.println("Price: Rs." + veg_price[2]);
								System.out.print("\n");
							}
							else
							{
								System.out.println("Invalid choice");
								break;
							}
							System.out.print("Enter 1 to confirm your order\nEnter 0 to cancel your order\nEnter your choice: ");
							conf=Integer.parseInt(reader.readLine());
							if(conf==1)
							{
								book_gen(fname, pnr);
							}
							else
							{
								System.out.println("Order not confirmed!");
								break;
							}							
							break;

					case 2: System.out.println("\nNon-Veg Options:");

							for(int i=0; i<meal_nveg.length; i++)
							{
								System.out.print(i + 1 + ".");
								System.out.print(meal_nveg[i]);
								System.out.print("\n");
							}

							System.out.print("Enter your choice: ");
							nvch=Integer.parseInt(reader.readLine());

							System.out.println("You have selected:");
							if (nvch==1)
							{
								System.out.println(sel.concat(meal_nveg[0]));
								System.out.println("Price: Rs." + nveg_price[0]);
								System.out.print("\n");
							}
							else if (nvch==2)
							{
								System.out.println(sel.concat(meal_nveg[1]));
								System.out.println("Price: Rs." + nveg_price[1]);
								System.out.print("\n");
							}
							else if (nvch==3)
							{
								System.out.println(sel.concat(meal_nveg[2]));
								System.out.println("Price: Rs." + nveg_price[2]);
								System.out.print("\n");
							}
							else
							{
								System.out.println("Invalid choice");
								break;
							}
							System.out.print("Enter 1 to confirm your order\nEnter 0 to cancel your order\nEnter your choice: ");
							conf=Integer.parseInt(reader.readLine());
							if(conf==1)
							{
								book_gen(fname, pnr);
							}
							else
							{
								System.out.println("Order not confirmed!");
								break;
							}						
							break;

					case 3: System.out.println("\nBeverage Options:");

							for(int i=0; i<bev.length; i++)
							{
								System.out.print(i + 1 + ".");
								System.out.print(bev[i]);
								System.out.print("\n");
							}

							System.out.print("\nEnter your choice: ");
							bevch=Integer.parseInt(reader.readLine());

							System.out.println("\nYou have selected:");
							if (bevch==1)
							{
								System.out.println(sel.concat(bev[0]));
								System.out.println("Price: Rs." + bev_price[0]);
								System.out.print("\n");
							}
							else if (bevch==2)
							{
								System.out.println(sel.concat(bev[1]));
								System.out.println("Price: Rs." + bev_price[1]);
								System.out.print("\n");
							}
							else if (bevch==3)
							{
								System.out.println(sel.concat(bev[2]));
								System.out.println("Price: Rs." + bev_price[2]);
								System.out.print("\n");
							}
							else
							{
								System.out.println("Invalid choice");
								break;
							}
							System.out.print("Enter 1 to confirm your order\nEnter 0 to cancel your order\nEnter your choice: ");
							conf=Integer.parseInt(reader.readLine());
							if(conf==1)
							{
								book_gen(fname, pnr);
							}
							else
							{
								System.out.println("Order not confirmed!");
								break;
							}	
							break;

					case 4:
							System.out.println("Thanks for using our service. Have a great day!");
							System.exit(0);

					default:System.out.println("Please enter a valid choice!");
							break;																

				}
			}while(mealtype!=4);
	} 
	static void book_gen(StringBuffer fname, String pnr) throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

		double r= Math.random()*10000000;
	    int b_ref=(int) r;
	    int ch;

		System.out.println("\nBooking Reference no.: " + b_ref);
		System.out.println("Passenger name: " + fname);
		System.out.println("PNR: " + pnr);
		System.out.println("\nHave a Happy & Safe Journey");

		System.out.print("\nEnter 1 to book another meal\nEnter 0 to Exit\nEnter your choice: ");
		ch=Integer.parseInt(reader.readLine());

		if(ch==1)
		{
			String[] temp={"1"};//temporary variable to pass as cmd line argument 
			main(temp);//passing temp as argument for the main function call
		}
		else
		{
			System.out.println("Thanks for using our service. Have a great day!");
			System.exit(0);
		}
	}

}