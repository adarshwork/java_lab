import java.util.Scanner;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
class inout 
{
  public static void main(String[] args) throws IOException
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter age:");
    int age = s.nextInt();
    System.out.println("Age: " + age);
    //Buffered Reader
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("Enter salary:");
    int salary = Integer.parseInt(reader.readLine()); 
    System.out.println("Salary: " + salary);    
  }
}
