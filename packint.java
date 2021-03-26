//Implement package and interface keywords in java.
//Domain: Concept Implementation System
//Implementation of Airline Check-in
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Date;  
import inface.checkin.*;

interface in1
{
	void book_gen(String pnr, double wt, double t_amount) throws IOException;
}
class packint implements in1
{	

	static
	{
			System.out.println("2047203 - ADARSH JHUNJHUNWALA");
			System.out.println("\nConcept id: 1001.4");
			System.out.println("Concept name: AIRLINE CHECK-IN");
			System.out.println("Concept type: CHECK-IN");
			System.out.println("Concept additional information: Check-in Passengers.");
			System.out.println("\nExample:");
			System.out.println("\nIT AIRLINE");	
	}

	public static void main(String args[]) throws IOException
	{
			packint pi=new packint();
			BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
			inface.checkin ci= new inface.checkin();
			int tr_type, ex_bg_check;
			double damt, iamt, e_wt;
			String pnr, ex_wt;

			System.out.print("\nEnter PNR: ");
			pnr=reader.readLine();

			if (pnr.length()!=6)
			{
				System.out.println("Enter a Valid PNR");
				main(null);
			}

			if (!pnr_check(pnr))
			{
				System.out.println("Enter a Valid PNR");
				main(null);
			}		

			ex_bg_check=ci.ch_in(pnr);
			if(ex_bg_check !=1 )
			{
				System.out.println("Thanks for using our service. Have a great day!");
				main(null);
			}


			do
			{
				System.out.print("\nEnter the Travel Type:\n1.DOMESTIC\n2.INTERNATIONAL\n3.EXIT\nEnter your choice: ");
				tr_type=Integer.parseInt(reader.readLine());
				if(tr_type==3)
				{
					System.out.println("Thanks for using our service. Have a great day!");
					System.exit(0);
				}
				System.out.print("\nEnter Excess Baggage Weight: ");
				ex_wt=reader.readLine();

				if (!wt_check(ex_wt))
				{
					System.out.println("Invalid weight!");
					main(null);
				}

				e_wt = Double.parseDouble(ex_wt);

				if(e_wt<=0)
				{
					System.out.println("Invalid weight!");
					main(null);
				}
				switch(tr_type)
				{
					case 1:
							damt=cal_damt(e_wt);
							pi.book_gen(pnr, e_wt, damt);
							break;
					case 2:
							iamt=cal_iamt(e_wt);
							pi.book_gen(pnr, e_wt, iamt);
							break;
					case 3:
							System.out.println("Thanks for using our service. Have a great day!");
							System.exit(0);

					default: 
							System.out.println("Please enter a valid choice");
							break;
				}
			}while(tr_type!=3);
	} 

	static double cal_damt(double ex_w)
	{
		double d_amt= ex_w*250;
		return d_amt;
	}

	static double cal_iamt(double ex_w)
	{
		double i_amt= ex_w*450;
		return i_amt;	
	}

	public static boolean pnr_check(String stnum) 
	{
	    if (stnum == null) 
	    {
	        return false;
	    }
	    try 
	    {
	        Integer i = Integer.parseInt(stnum);
	    } 
	    catch (NumberFormatException nfe) 
	    {
	        return false;
	    }
	    return true;
    }

	public static boolean wt_check(String st_num) 
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
	public void book_gen(String pnr, double wt, double t_amount) throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

		double r= Math.random()*10000000;
	    int b_ref=(int) r;
	    int ch;

		System.out.println("\nBooking Reference no.: " + b_ref);
		System.out.println("PNR: " + pnr);
		System.out.println("Excess Baggage Weight: " + wt);
		System.out.println("Total amount: INR " + t_amount);
		System.out.println("\nHave a Happy & Safe Journey");

		System.out.print("\nEnter 1 to Check-in another Passenger\nEnter 0 to Exit\nEnter your choice: ");
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


}