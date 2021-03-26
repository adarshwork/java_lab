//Implement the concept of multithreading in java.
//Domain: Concept Implementation System
//Implementation of Airline Flight Status Check
import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Date;  
import java.time.LocalDate;

class FlightFinder extends Thread
{
   private Thread t;

   public void run() 
   {

        try 
        {
            Thread.sleep(1);
            System.out.println("\nHold on.....\n");
        } 
        catch (InterruptedException e)
        {
        }
   }
   
   public void start() 
   {
      if (t == null) 
      {
        t = new Thread(this);
        t.start();
      }
   }
}

class mthread
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

    mthread(String source, String dest, String date)
    {
            this.source=source;
            this.dest=dest;
            this.date=date;
    }
    public static void main(String args[]) throws IOException
    {
            BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
            FlightFinder t1 = new FlightFinder();
            FlightFinder t2 = new FlightFinder();
            

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
            
            t1.start();
            t2.start();
            mthread in=new mthread(source, dest, date);

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
            
            status=status_gen();

            System.out.println("\nSource    Destination    Date        Status");
            System.out.println(source.toUpperCase() + "       " + dest.toUpperCase() + "            " + date + "  " + fl_status[status]);
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
            String dateAfter2days = LocalDate.now().plusDays(2).toString();
            df.setLenient(false);
            try
            {
                df.parse(text);
                //Date date = new Date(); 
                String date=LocalDate.now().toString();
                if(df.parse(text).before(df.parse(date)) || df.parse(text).after(df.parse(dateAfter2days)))
                    return false;
                return true;
            } 
            catch (ParseException ex)
            {
                return false;
            }
    }

    static int status_gen()
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