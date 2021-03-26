package pack2;
import java.io.*;
public class SavingBankAccount
{
int minAccountBalance= 1000, maxDepositAmount = 25000,accountBalance ;
public void deposit() throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the amount to be deposited: ");
int depAmount = Integer.parseInt(br.readLine());
if (depAmount >= maxDepositAmount)
{
System.out.println("You can not deposit amount greater than"+maxDepositAmount);
}
else if(depAmount < 0)
{
System.out.println("Invalid amount entered!!! Please try again");
}
else
accountBalance = accountBalance + depAmount;
System.out.println("Your account balance is : "+accountBalance);
}
public void withdraw() throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the amount to be withdrawn: ");
int wdAmount = Integer.parseInt(br.readLine());
if(wdAmount < 0)
{
System.out.println("Invalid amount entered!!! Please try again");
}
else if (accountBalance - wdAmount <= minAccountBalance)
{
System.out.println("You can not withdraw amount from your Savings Account as Minimum Balance limit is reached");

}
else
accountBalance = accountBalance - wdAmount;
System.out.println("Your account balance is : "+accountBalance);
}
public void calcInterest()
{
System.out.println("Your interest amount(3%) is : "+(accountBalance * 3) / 100);
}
}
