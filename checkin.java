//Implement package and interface keywords in java.
//Domain: Concept Implementation System
//Implementation of Airline Check-in
package inface;
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Date;

public class checkin
{

	public static int ch_in(String pnr) throws IOException
	{
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		String name, date, source, dest;
		String[] loc={"BLR", "CCU", "DEL", "BOM", "MAA"};
		List<String> locs = new ArrayList<>(Arrays.asList(loc));
		String ad_no;
		int exbg_ch;
		System.out.print("Enter your name: ");
		name=reader.readLine();
		System.out.print("Enter the source: ");
		source=reader.readLine();

		if(!locs.contains(source.toUpperCase()))
		{
			System.out.println("Invalid input/Location not available yet.");
			ch_in(pnr);
		}

		System.out.print("Enter the destination: ");
		dest=reader.readLine();

		if(!locs.contains(dest.toUpperCase()))
		{
			System.out.println("Invalid input/Location not available yet.");
			ch_in(pnr);
		}

		if(dest.toUpperCase().equals(source.toUpperCase()))
		{
			System.out.println("Source and Destination cannot be the same!");
			ch_in(pnr);				
		}

		System.out.print("Enter Travel date: ");
		date=reader.readLine();
		if (!isValid(date))
		{
			System.out.println("Invalid date!");
			ch_in(pnr);
		}
		System.out.print("Enter your Aadhaar Number: ");
		ad_no=reader.readLine();
		if(ad_no.length()!=12)
		{
			System.out.println("Enter a Valid Aadhaar No.");
			ch_in(pnr);
		}
		if(!ad_check(ad_no))
		{
			System.out.println("Enter a Valid Aadhaar No.");
			ch_in(pnr);
		}
		System.out.print("\nDo you have any excess baggage?\nEnter 1 for Yes, 0 for No.\nEnter your choice: ");
		exbg_ch=Integer.parseInt(reader.readLine());
		if(exbg_ch == 0)
		{
			bpass_gen(pnr, name, source, dest, date, exbg_ch);
		}
		else if(exbg_ch == 1)
		{
			int res=bpass_gen(pnr, name, source, dest, date, exbg_ch);
			if(res==1)
				return 1;
			else
				ch_in(pnr);
		}
		else
		{
			System.out.println("Enter a valid choice");
			ch_in(pnr);
		}
		return 0;

	}
	static int bpass_gen(String pnr, String name, String source, String dest, String date, int exbg_ch) throws IOException
	{
		int ch;
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		String[] fl_list= {"Indigo SE-123", "SpiceJet SE-321", "GoAir GA-290", "AirAsia AA-209", "Air India AI-872"};
		String[] fl_dep= {"20:00", "15:00", "10:00", "07:00", "04:00"};
		String[] fl_ar= {"22:30", "19:30", "12:30", "10:30", "18:30"};
		String[] seat={"A", "B", "C", "D", "E", "F"};
		double r= Math.random()*10;
		int ra=(int) r;
		if (ra>4)
		    ra=4;
 		double r2= Math.random()*10;
 		if (r2>5)
		    r2=5;
 		int ra2=(int) r2;
 		double r3= Math.random()*100;
 		if (r3>30)
		    r3=30;
 		int ra3=(int) r3;

		System.out.println("--------------------------------------------");
		System.out.println("		BOARDING PASS");
		System.out.println(" PNR:			" + pnr);
		System.out.println(" PASSENGER NAME:	" + name);
		System.out.println(" SOURCE:		" + source);
		System.out.println(" DESTINATION:		" + dest);
		System.out.println(" Flight No.:		" + fl_list[ra]);
		System.out.println(" DEPARTURE:		" + fl_dep[ra]);
		System.out.println(" ARRIVAL:		" + fl_ar[ra]);
		System.out.println(" TRAVEL DATE:		" + date);
		System.out.println(" SEAT NO.:		" + ra3 + seat[ra2]);
		System.out.println("--------------------------------------------");

		if(exbg_ch == 1)
		{
			return 1;
		}
		System.out.print("\nEnter 1 to Check-in another Passenger\nEnter 0 to Exit\nEnter your choice: ");
		ch=Integer.parseInt(reader.readLine());

		if(ch==1)
		{
			System.out.print("\nEnter PNR: ");
			pnr=reader.readLine();

			if (pnr.length()!=6)
			{
				System.out.println("Enter a Valid PNR");
				ch_in(pnr);
			}

			if (!pnr_check(pnr))
			{
				System.out.println("Enter a Valid PNR");
				ch_in(pnr);
			}	
			ch_in(pnr);
		}
		else
		{
			System.out.println("Thanks for using our service. Have a great day!");
			System.exit(0);
		}
		return 0;
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

    public static boolean ad_check(String stnum) 
	{
	    if (stnum == null) 
	    {
	        return false;
	    }
	    try 
	    {
	        Long i = Long.parseLong(stnum);
	    } 
	    catch (NumberFormatException nfe) 
	    {
	        return false;
	    }
	    return true;
    }

}

