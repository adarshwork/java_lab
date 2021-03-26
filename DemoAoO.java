import java.io.*;
class Student
{
	int i,age;
	String name;
	Student(String nam,int old)
	{
		name=nam; 
		age=old;
	}
	public void showOutput()
	{
		System.out.println("Name:" + name  +"  "+ "Age:"+ age);
		System.out.println("********************************");
	}
}

class DemoAoO
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		int i,age=1;
		String name="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Student obj[]=new Student[3];
		for(i=0;i<3;i++)
		{
			System.out.print("\nEnter the name of Student "+(i+1) + ": ");
			name=br.readLine();
			System.out.print("Enter the age of Student " +(i+1) + ": ");
			age=Integer.parseInt(br.readLine());
			obj[i]=new Student(name,age);
		}
		System.out.println("\n\n********Student Details*********\n\n");
		for(i=0;i<3;i++)
		{
			obj[i].showOutput();
		} 
	}
}