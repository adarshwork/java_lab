import java.io.*;
// importing the 3 packages created to this program
import pack1.BankAccount.*;
import pack2.SavingBankAccount.*;
import pack3.CurrentBankAccount.*;
public class ATMpgm
{
public static void main(String args[]) throws IOException
{
int c1,c2;
char ch1,ch2;
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("********************WELCOME****************************");
System.out.println("***********AUTOMATED TELLER MACHINE********************");

System.out.println("********************************************************");
System.out.println(" Program to deposit and withdraw money from an ATM Machine ");
System.out.println("*****************************************************");

System.out.println(" ");
System.out.println(" ");
System.out.println(" Enter account details: ");
pack1.BankAccount ba = new pack1.BankAccount();
ba.getdata();
System.out.println(" Choose your account type: ");
System.out.println(" 1. Savings Account ");
System.out.println(" 2. Current Account ");
System.out.println(" Enter your choice: ");
c1 = Integer.parseInt(b.readLine());
switch(c1)
{
case 1: pack2.SavingBankAccount s = new pack2.SavingBankAccount();

do
{
System.out.println(" What do you want to do? ");
System.out.println(" 1. Deposit ");
System.out.println(" 2. Withdraw ");
System.out.println(" 3.Calculate Interest ");
System.out.println(" Enter your choice: ");
c2 = Integer.parseInt(b.readLine());

switch(c2)
{

case 1: s.deposit();
break;
case 2: s.withdraw();
break;
case 3: s.calcInterest();
break;

default: System.out.println("Invalid choice");
}
System.out.println("Do you wish to continue? ");

ch1 = (char)b.readLine().charAt(0);
}while(ch1 == 'y');

break;

case 2: pack3.CurrentBankAccount c = new pack3.CurrentBankAccount();
do{System.out.println(" What do you want to do? ");
System.out.println(" 1. Deposit ");
System.out.println(" 2. Withdraw ");
System.out.println(" 3.Calculate Interest ");
System.out.println(" Enter your choice: ");
c2 = Integer.parseInt(b.readLine());

switch(c2)
{

case 1: c.deposit();
break;
case 2: c.withdraw();
break;
case 3: c.calcInterest();
break;

default: System.out.println("Invalid choice");
}
System.out.println("Do you wish to continue? ");

ch1 = (char)b.readLine().charAt(0);;
}while(ch1 == 'y');

break;
default: System.out.println("Invalid choice");
break;

}
System.out.println("Do you wish to continue for another account? ");

ch2 = (char)b.readLine().charAt(0);

}while(ch2 == 'y');
}
}