import java.io.*; 

interface Bank
{
	void CreateAccount() throws IOException;
	void Deposit() throws IOException;
	void Withdraw() throws IOException;
	void Getbalance();
}
public class sib implements Bank
{	
	BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	String bankid, branch, location, ifsc, cname;
	double inrate, r1;
	int age, cid;
	double damt, c_bal=0, wamt;

	void SetMonthlyInterest()
	{
		inrate=0.07/12;
	}

	void CreateAccount() throws IOException
	{
		double r1= Math.random()*1000000;
	    cid=(int) r1;
		System.out.print("Enter name: ");
		cname=reader.readLine();
		System.out.print("Enter age: ");
		age=Integer.parseInt(reader.readLine());
		if(age<18)
			System.out.println("Age must be >= 18");
	}
	void Deposit() throws IOException
	{
		System.out.print("Enter Deposit amount: ");
		damt=Double.parseDouble(reader.readLine());
		if(damt<=0)
			System.out.println("Deposit amount must be > 0");
		else
			c_bal+=damt;
	}
	void Withdraw() throws IOException
	{
		System.out.print("Enter Withdrawal amount: ");
		wamt=Double.parseDouble(reader.readLine());
		if(wamt>c_bal)
			System.out.println("Withdrawal amount cannot be > Current Balance");
		else
			c_bal-=wamt;
	}
	void Getbalance()
	{
		System.out.print("Current Balance: " + c_bal);
	}
}
public class axis implements Bank
{	
	BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
	String bankid, branch, location, ifsc, cname;
	double inrate, r1;
	int age, cid;
	double damt, c_bal=0, wamt;

	void SetMonthlyInterest()
	{
		inrate=0.08/12;
	}

	void CreateAccount() throws IOException
	{
		double r2= Math.random()*1000000;
	    cid=(int) r2;
		System.out.print("Enter name: ");
		cname=reader.readLine();
		System.out.print("Enter age: ");
		age=Integer.parseInt(reader.readLine());
		if(age<18)
			System.out.println("Age must be >= 18");
	}
	void Deposit() throws IOException
	{
		System.out.print("Enter Deposit amount: ");
		damt=Double.parseDouble(reader.readLine());
		if(damt<=0)
			System.out.println("Deposit amount must be > 0");
		else
			c_bal+=damt;
	}
	void Withdraw() throws IOException
	{
		System.out.print("Enter Withdrawal amount: ");
		wamt=Double.parseDouble(reader.readLine());
		if(wamt>c_bal)
			System.out.println("Withdrawal amount cannot be > Current Balance");
		else
			c_bal-=wamt;
	}
	void Getbalance()
	{
		System.out.print("Current Balance: " + c_bal);
	}
}
class Customer extends sib
{
	static
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");	
	}
	String cid, cname, accno, typeac, phno, bankid, bankname;
	double anint, c_bal;
	void AccountDetails()
	{
		System.out.println("Customer Id: " + cid);
		System.out.println("Customer Name: " + cname);
		System.out.println("Bank Id: " + bankid);
		System.out.println("Bank Name: " + bankname);
		System.out.println("Balance: " + c_bal);
		System.out.println("Annual Interest: " + anint);
	}
	public static void main(String args[]) throws IOException
	{
		int choice, b_ch;
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		sib s1=new sib();
		axis a1=new axis();
		Customer c1=new Customer();
		do
		{
			System.out.print("\nAvailable Banks:\n1.SIB\n2.AXIS\n3.EXIT\nEnter your choice: ");
			b_ch=Integer.parseInt(reader.readLine());
			switch(b_ch)
			{
				case 1: 
						System.out.print("\nAvailable Operations:\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.EXIT\nEnter your choice: ");
						choice=Integer.parseInt(reader.readLine());
						switch(choice)
						{
							case 1:
									s1.CreateAccount();
									break;
							case 2:
									s1.Deposit();
									break;
							case 3:
									s1.Withdraw();
									break;
							case 4:
									s1.Getbalance();
									break;																			
							case 5: c1.AccountDetails();
									break;																			
							case 6:
									System.out.println("Have a nice day!");
									System.exit(0);
							default: 
									System.out.println("Please enter a valid choice");
									break;
						}
						break;
				case 2: 
						System.out.print("\nAvailable Operations:\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.Check Account Details\n6.EXIT\nEnter your choice: ");
						choice=Integer.parseInt(reader.readLine());
						switch(choice)
						{
							case 1:
									a1.CreateAccount();
									break;
							case 2:
									a1.Deposit();
									break;
							case 3:
									a1.Withdraw();
									break;
							case 4:
									a1.Getbalance();
									break;
							case 5: c1.AccountDetails();
									break;																			
							case 6:
									System.out.println("Have a nice day!");
									System.exit(0);
							default: 
									System.out.println("Please enter a valid choice");
									break;
						}
						break;
				case 3:
						System.out.println("Have a nice day!");
						System.exit(0);
				default: 
						System.out.println("Please enter a valid choice");
						break;
			}					

		}while(b_ch!=3);

	}
}