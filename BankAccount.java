package pack1;
import java.io.*;
public class BankAccount
{
public void getdata() throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name of account holder: ");
String accountHolderName = br.readLine();
System.out.println("Enter the account number: ");
String accountNumber = br.readLine();
}
}
// This is the 2nd