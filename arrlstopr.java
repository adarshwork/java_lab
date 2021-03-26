import java.io.*;
import java.util.*;

class arrlstopr 
{
  public static void main(String[] args) throws IOException
  {
  	System.out.println("2047203 - ADARSH JHUNJHUNWALA");
  	BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
  	int choice, size, i, ch_index, rm_choice, rm_index;
  	String elm, ch_elm, rm_elm;
    ArrayList<String> arlist = new ArrayList<>();
    Iterator<String> iter = arlist.iterator();
    do
    {
    	System.out.print("\n1.ADD\n2.FIND SIZE\n3.UPDATE\n4.REMOVE\n5.DISPLAY\n6.EXIT\nEnter your choice: ");
    	choice = Integer.parseInt(reader.readLine());
    	switch(choice)
    	{
    		case 1:
    				System.out.print("Enter the no. of elements required: ");
    				size= Integer.parseInt(reader.readLine());
    				for(i=0; i<size; i++)
    				{
    					System.out.print("Enter element " + (i+1) + ": ");
    					elm=reader.readLine();
    					arlist.add(elm);
    				}
                    iter = arlist.iterator();
    				break;
    		case 2:
    				System.out.println("ArrayList Size: " + arlist.size());
    				break;
    		case 3:
    				System.out.print("Enter the index: ");
    				ch_index= Integer.parseInt(reader.readLine());
    				System.out.print("Enter the new element: ");
    				ch_elm=reader.readLine();
    				arlist.set(ch_index, ch_elm);
                    iter = arlist.iterator();
    				break;
    		case 4:	
    				System.out.print("Removal Options\n1.Index\n2.Object\n3.First Element\n4.Last element\nEnter your choice: ");
    				rm_choice = Integer.parseInt(reader.readLine());
    				switch(rm_choice)
    				{
    					case 1: 
			    				System.out.print("Enter the index: ");
			    				rm_index= Integer.parseInt(reader.readLine());
			    				arlist.remove(rm_index);
			    				break;
    					case 2: 
			    				System.out.print("Enter the object: ");
			    				rm_elm= reader.readLine();
			    				arlist.remove(rm_elm);
			    				break;	
    					case 3: 
			    				arlist.remove(0);
			    				break;		
    					case 4: 
			    				arlist.remove(arlist.size()-1);
			    				break;				    					    						    				
    				}
                    iter = arlist.iterator();
    				break;
    		case 5:
                    System.out.println("Elements are: ");
    		        while (iter.hasNext())
    		        {
            			System.out.print(iter.next() + ", ");
        			}
    				break;
    		case 6:
    				System.out.println("Program will now exit.");
    				System.exit(0);
    				break;  
    		default:
    				System.out.println("Enter a valid choice");
    				break;

    	}

    }while(choice !=6);
    }
}

