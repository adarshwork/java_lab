//Implement generic and collection concept
//Domain: Concept Implementation System
//Implementation of Airline Cab Booking
import java.io.*;
import java.util.*;

class PNRLengthException extends Exception
{
    public PNRLengthException(String s)
    {
        super(s);
    }
}

public class gen
{	
	static
	{
			System.out.println("2047203 - ADARSH JHUNJHUNWALA");
			System.out.println("\nConcept id: 1001.5");
			System.out.println("Concept name: AIRLINE CAB BOOKING");
			System.out.println("Concept type: Status Check");
			System.out.println("Concept additional information: Book Cabs to/from the Airport.");
			System.out.println("\nExample:");
			System.out.println("\nIT AIRLINE");	
	}

	public static void main(String args[]) throws IOException, PNRLengthException
	{
			BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

			String pnr, pickup_loc, drop_loc, p_di, d_di;
			int choice, ch, status, conf, c;
			double p_dis, d_dis, p_price, d_price, t_price;
			
			//Creating an Array list of available cars
			ArrayList<String> cars=new ArrayList<String>(); 
			//Add the cars to the Array list
			cars.add("Maruti Suzuki Swift");
			cars.add("Hyundai i20");
			cars.add("Tata Indica");
			cars.add("Honda Amaze");
			cars.add("Toyota Innova");
			cars.add("Mahindra XUV 300");

		do
    	{
			System.out.print("\nEnter PNR: ");
			pnr=reader.readLine();
			try
			{
				if (pnr.length()!=6)
				{
					throw new PNRLengthException("PNRLengthException");	
				}

				Integer i = Integer.parseInt(pnr);
			}
	        catch (PNRLengthException ex)
	        {
	            ex.printStackTrace();
	            main(null);
	        }
	       	catch (NumberFormatException nfe) 
		    {
		        nfe.printStackTrace();
		        main(null);
		    }		

			System.out.print("\nEnter Pickup Location in Source City: ");
			pickup_loc=reader.readLine();

			System.out.print("Enter the Distance between Pickup location and the Airport (in kms): ");
		    p_di = reader.readLine();

		    if (!dis_check(p_di))
			{
				System.out.println("Enter a valid Distance");
				main(null);
			}
			p_dis=Double.parseDouble(p_di);

			if(p_dis<=0)
			{
				System.out.println("Enter a valid Distance");
				main(null);
			}

			System.out.print("\nEnter Drop location in Destination City: ");
			drop_loc=reader.readLine();

			System.out.print("Enter the Distance between Airport and the Drop location (in kms): ");
		    d_di = reader.readLine();

		    if (!dis_check(d_di))
			{
				System.out.println("Enter a valid Distance");
				main(null);
			}
			d_dis=Double.parseDouble(d_di);

			if(d_dis<=0)
			{
				System.out.println("Enter a valid Distance");
				main(null);
			}

			if(pickup_loc.toUpperCase().equals(drop_loc.toUpperCase()))
			{
				System.out.println("Pickup and Drop location cannot be the same!");
				main(null);				
			}

		    System.out.print("\nAvailable Cab Types:\n1.Go\n2.Sedan\n3.SUV\n4.EXIT\nEnter your choice: ");
		    ch = Integer.parseInt(reader.readLine());
		    switch(ch)
		    {
			    case 1: System.out.println("Cars Available:");

			            for (int i = 0; i < 2; i++) 
			            {
			            	//Display list of available Go cars
			            	System.out.println(cars.get(i));
			            }   

			            if(p_dis<=5)
			                p_price=p_dis*10;
			            else if(p_dis>5 && p_dis<=10)
			                p_price=50+((p_dis-5)*20);
			            else
			                p_price=150+((p_dis-10)*30);

			            if(d_dis<=5)
			                d_price=d_dis*10;
			            else if(d_dis>5 && d_dis<=10)
			                d_price=50+((d_dis-5)*20);
			            else
			                d_price=150+((d_dis-10)*30);			        
			            t_price=p_price+d_price;
						System.out.print("Enter 1 to confirm your booking\nEnter 0 to cancel your booking\nEnter your choice: ");
						conf=Integer.parseInt(reader.readLine());
						if(conf==1)
						{
			            book_gen(pnr, pickup_loc, p_dis, drop_loc, d_dis, t_price);
						}
						else
						{
							System.out.println("Booking not confirmed!");
							break;
						}			            
			            break;
			    case 2: System.out.println("Cars Available:");
			            for (int i = 2; i < 4; i++) 
			            {
			            	//Display list of available Sedan cars
			            	System.out.println(cars.get(i));
			            }  
			            if(p_dis<=5)
			                p_price=p_dis*20;
			            else if(p_dis>5 && p_dis<=10)
			                p_price=100+((p_dis-5)*40);
			            else
			                p_price=300+((p_dis-10)*60);

			            if(d_dis<=5)
			                d_price=d_dis*20;
			            else if(d_dis>5 && d_dis<=10)
			                d_price=100+((d_dis-5)*40);
			            else
			                d_price=300+((d_dis-10)*60);			            
			            t_price=p_price+d_price;
						System.out.print("Enter 1 to confirm your booking\nEnter 0 to cancel your booking\nEnter your choice: ");
						conf=Integer.parseInt(reader.readLine());
						if(conf==1)
						{
			            book_gen(pnr, pickup_loc, p_dis, drop_loc, d_dis, t_price);
						}
						else
						{
							System.out.println("Booking not confirmed!");
							break;
						}
			            break;
			    case 3: System.out.println("Cars Available:");

			            for (int i = 4; i < 6; i++) 
			            {
			            	//Display list of available SUV cars
			            	System.out.println(cars.get(i));
			            }  

			            if(p_dis<=5)
			                p_price=p_dis*30;
			            else if(p_dis>5 && p_dis<=10)
			                p_price=150+((p_dis-5)*60);
			            else
			                p_price=450+((p_dis-10)*90);

			            if(d_dis<=5)
			                d_price=d_dis*30;
			            else if(d_dis>5 && d_dis<=10)
			                d_price=150+((d_dis-5)*60);
			            else
			                d_price=450+((d_dis-10)*90);			         
			            t_price=p_price+d_price;
						System.out.print("Enter 1 to confirm your booking\nEnter 0 to cancel your booking\nEnter your choice: ");
						conf=Integer.parseInt(reader.readLine());
						if(conf==1)
						{
			            book_gen(pnr, pickup_loc, p_dis, drop_loc, d_dis, t_price);
						}
						else
						{
							System.out.println("Booking not confirmed!");
							break;
						}
			            break;
				case 4:
						System.out.println("Thanks for using our service. Have a great day!");
						System.exit(0);

				default: 
						System.out.println("Please enter a valid choice");
						break;
		    }
		    System.out.print("Do you want to continue?\nEnter 1 for Yes\nEnter 0 for No\nEnter your choice: ");
		    c=Integer.parseInt(reader.readLine());
		} while(c==1);
	} 

    public static boolean dis_check(String st_num) 
	{
	    if (st_num == null) 
	    {
	        return false;
	    }
	    try 
	    {
	    	double d = Double.parseDouble(st_num);
	    } 
	    catch (NumberFormatException nfe) 
	    {
	        return false;
	    }
	    return true;
    }

	static void book_gen(String pnr, String ploc, double pdis,String dloc, double ddis, double tprice) throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

		double r= Math.random()*10000000;
	    int b_ref=(int) r;
	    double r2= Math.random()*100;
	    int time_p=(int) r2;
	    double r3= Math.random()*10;
	    int time_d=(int) r3;
	    int ch;

		System.out.println("\nBooking Reference no.: " + b_ref);
		System.out.println("PNR: " + pnr);
		System.out.println("Pickup location from Source City: " + ploc);
		System.out.println("Distance between Pickup location and the Airport: " + pdis + "kms");
		System.out.println("\nThe Driver will arrive at the Pickup location in " + time_p + " minutes\n");
		System.out.println("Drop location in Destination City: " + dloc);
		System.out.println("Distance between Airport and the Drop location: " + ddis + "kms");
		System.out.println("\nThe Driver will arrive at the Destination Airport in " + time_d + " minutes after landing\n");
		System.out.println("Total fare:INR" + tprice);
		System.out.println("\nHave a Happy & Safe Journey");
	}

}