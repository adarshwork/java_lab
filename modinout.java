import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.*; 
class modinout 
{
  public static void main(String args[]) throws IOException
  {
    System.out.println("2047203 - ADARSH JHUNJHUNWALA");
    //Part 1 
    //Scanner Input
    Scanner s = new Scanner(System.in);
    System.out.print("Scanner Input\nEnter age:");
    int age = s.nextInt();
    System.out.println("Age: " + age);
    //BufferedReader Input
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("BufferedReader Input\nEnter salary:");
    int salary = Integer.parseInt(reader.readLine()); 
    System.out.println("Salary: " + salary);  
    //Part 2
    //Command Line Input
    int n1=Integer.parseInt(args[0]);
    System.out.println("BufferedReader Input Input");
    //BufferedReader Input
    System.out.println("Enter 2 nos.");
    int n2=Integer.parseInt(reader.readLine());
    int n3=Integer.parseInt(reader.readLine());
    System.out.println("3 numbers entered by user: "+n1+" "+n2+" "+n3);
    //Part 3
    int choice, i;
    lbl1:do
    {
      System.out.print("\nEnter 1 to print odd nos. from 1-50\nEnter 2 to print even nos. from 1-50\nEnter 3 to Exit the loop\nEnter your choice: ");
      
      choice = s.nextInt();
      switch(choice)
      {
        case 1: System.out.print("Odd nos. from 1-50: ");
                for(i=1;i<=50;i++)
                {
                  if (i % 2 != 0) 
                  {
                    System.out.print(i + " ");
                  }
                }
                break;
        case 2: System.out.print("Even nos. from 1-50: ");
                for(i=1;i<=50;i++)
                {
                  if (i % 2 != 1) 
                  {
                    System.out.print(i + " ");
                  }
                }
                break;
        case 3:
                System.exit(0);
                break;
        default:System.out.println("Please enter a valid input.");
                break;
      }
    }while(choice!=3);
  }
}
