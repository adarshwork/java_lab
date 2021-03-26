import java.io.*;
import java.util.*;
import java.text.*;
class Student
{
	int i, reg;
	String name, dob, email;
	double m1, m2, m3, m4, m5, total, per;
	Student(String name, String dob, String email, int reg, double m1, double m2, double m3, double m4, double m5, double total, double per)
	{
		this.name=name; 
		this.dob=dob;
		this.email=email;
		this.reg=reg;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.total=total;
		this.per=per;

	}
	/*
	public double getper()
	{
		return per;
	}
	public void setper(double per) 
	{
        this.per = per;
    }
    */
	public void showOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("DOB: " + dob);
		System.out.println("Email: " + email);
		System.out.println("Reg: " + reg);
		System.out.println("Sub1 Marks: " + m1);
		System.out.println("Sub2 Marks: " + m2);
		System.out.println("Sub3 Marks: " + m3);
		System.out.println("Sub4 Marks: " + m4);
		System.out.println("Sub5 Marks: " + m5);
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + per);
		System.out.println("********************************");
	}
}

class studentrecord
{
	static
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
	}
	public static void main(String args[]) throws IOException
	{
		int i, reg;
		double r, m1=1.0, m2=1.0, m3=1.0, m4=1.0, m5=1.0, total=1.0, per=1.0;
		String name="", dob="", email="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Student obj[]=new Student[5];
		for(i=0;i<5;i++)
		{
			System.out.print("\nEnter Name of Student "+(i+1) + ": ");
			name=br.readLine();
			System.out.print("Enter DOB of Student " +(i+1) + " (yyyy-MM-dd): ");
			dob=br.readLine();
			if (!isValid(dob))
			{
				System.out.println("Invalid date!");
				i--;
				continue;
			}
			r= Math.random()*10000000;
	    	reg=(int) r;
			System.out.print("Enter e-mail of Student " +(i+1) + ": ");
			email = br.readLine();
			if (!email.matches("^(.+)@(.+)$"))
			{
				System.out.println("Invalid email id!");
				i--;
				continue;
			}
			System.out.print("Enter Sub1 Marks of Student " +(i+1) + ": ");
			m1=Double.parseDouble(br.readLine());
			if(m1<0 || m1>100)
			{
				System.out.println("Invalid marks!");
				i--;
				continue;
			}
			System.out.print("Enter Sub2 Marks of Student " +(i+1) + ": ");
			m2=Double.parseDouble(br.readLine());
			if(m2<0 || m2>100)
			{
				System.out.println("Invalid marks!");
				i--;
				continue;
			}
			System.out.print("Enter Sub3 Marks of Student " +(i+1) + ": ");
			m3=Double.parseDouble(br.readLine());
			if(m3<0 || m3>100)
			{
				System.out.println("Invalid marks!");
				i--;
				continue;
			}
			System.out.print("Enter Sub4 Marks of Student " +(i+1) + ": ");
			m4=Double.parseDouble(br.readLine());
			if(m4<0 || m4>100)
			{
				System.out.println("Invalid marks!");
				break;
			}
			System.out.print("Enter Sub5 Marks of Student " +(i+1) + ": ");
			m5=Double.parseDouble(br.readLine());
			if(m5<0 || m5>100)
			{
				System.out.println("Invalid marks!");
				i--;
				continue;
			}
			total=m1+m2+m3+m4+m5;
			per=total/5;
			obj[i]=new Student(name.toUpperCase(), dob, email, reg, m1, m2, m3, m4, m5, total, per);
		}
		System.out.println("\n\n********Student Details*********\n\n");
		for(i=0;i<5;i++)
		{
			/*
			ArrayList<Student> details = new ArrayList<Student>();
			Collections.sort(details, Comparator.comparingDouble(Student::getper).reversed());
			*/
			obj[i].showOutput();
		} 
	}

	public static boolean isValid(String text) 
	{
	    if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
	        return false;
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    df.setLenient(false);
	    try
	    {
	        df.parse(text);
	        return true;
	    } 
	    catch (ParseException ex)
	    {
	        return false;
	    }
	}
}