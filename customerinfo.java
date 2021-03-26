import java.io.*;
import java.util.Scanner;
class Customer 
{
	String name, mailid; int age; String addr; Long mobile; int days;
	public Customer getData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("------Enter customer details----");
		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Customer Age: ");
		int age = sc.nextInt();
		if(age<=0 || age>120)
		{
			System.out.println("Age must be > 0 and < 120!");
			getData();
		}
		System.out.print("Enter Customer Address: ");
		String addr = sc.next();
		System.out.print("Enter Customer contact number: ");
		Long mobile = sc.nextLong();
		if (!mobile.toString().matches("[0-9]{10}"))
		{
			System.out.println("Invalid contact number!");
			getData();
		}
		System.out.print("Enter Customer e-mail: ");
		String mailid = sc.next();
		if (!mailid.matches("^(.+)@(.+)$"))
		{
			System.out.println("Invalid email id!");
			getData();
		}
		System.out.print("Enter No. of days of stay: ");
		int days = sc.nextInt();
		System.out.println("\n");
		this.name = name;
		this.addr = addr;
		this.mobile = mobile;
		this.mailid=mailid;
		this.age = age;
		this.days = days; 
		return this;
	}
	public void display() 
	{
		System.out.println("Name - " + name);
		System.out.println("Address - " + addr);
		System.out.println("Age -" + age);
		System.out.println("Contact number - " + mobile);
		System.out.println("Duration of stay-" + days);
	}
}

public class customerinfo 
{
	public static void main(String args[]) 
	{
		Customer[] c1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of customers: ");
		int num = sc.nextInt();
		c1 = new Customer[num];
		for (int i = 0; i < num; i++) 
		{
		    Customer c = new Customer();
		    c1[i] = c.getData();  
		}
		for (int i = 0; i < c1.length; i++) 
		{
		    c1[i].display();   
		}
	}
}