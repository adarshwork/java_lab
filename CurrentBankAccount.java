package pack3;
import java.io.*;
public class CurrentBankAccount
{
int minAccountBalance= 0, maxDepositAmount = 50000,accountBalance ;
int penalty;
public void deposit() throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the amount you want to deposit: ");
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
System.out.println("If your account balance is less than 1000, 10% penalty will be charged. ");

System.out.println("Your account balance is : "+accountBalance);
System.out.println("Enter the amount to be withdrawn: ");
int wdAmount = Integer.parseInt(br.readLine());
if(wdAmount < 0)
{
System.out.println("Invalid amount entered!!! Please try again");
}
else if (accountBalance - wdAmount <= 1000 && accountBalance - wdAmount > 0)
{
penalty = (1000 - (accountBalance - wdAmount))/10;
System.out.println("Penalty of amount: "+penalty);
accountBalance = accountBalance - (wdAmount+penalty);
}
else if (accountBalance - wdAmount < 0)
{
System.out.println("You can not withdraw amount from your Savings Account as Minimum Balance limit is reached");

}
else
accountBalance = accountBalance - wdAmount;
System.out.println("Your account balance is : "+accountBalance);
}
public void calcInterest()
{
System.out.println("Your interest amount(2%) is : "+(accountBalance * 2) / 100);
}
}