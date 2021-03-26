import java.io.*;
import java.util.Scanner;
class strandstrbuffer
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
		String s1,s2;
		char ch;
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb1 = new StringBuffer();
			StringBuffer sb2 = new StringBuffer();
			Scanner s = new Scanner(System.in);
		    System.out.println("\nString Methods\n1.Concat\n2.Length\n3.CharAt\n4.Compareto\n5.tolowerCase\nStringBuffer Methods\n6.Append\n7.Insert\n8.Capacity\n9.Delete\n10.Reverse\n");
			System.out.print("Enter the choice: ");
			int c=Integer.parseInt(br.readLine());
			switch(c)
			{
				case 1: System.out.print("\n\nEnter 1st string: ");
						s1=br.readLine();
						System.out.print("\nEnter 2nd string: ");
						s2=br.readLine();
						System.out.println("\nThe concatenated string is: "+s1.concat(s2));
						break;
				case 2: System.out.print("\nEnter the string: ");
						s1=br.readLine();
						System.out.println("\nThe length of the string is: "+s1.length());
						break;
				case 3: System.out.print("\nEnter the string: ");
						s1=br.readLine();
				        System.out.print("\nEnter the position: ");
				        int n=Integer.parseInt(br.readLine());
						System.out.printf("The character at %d th position is %c",n,s1.charAt(n));
						break;  
				case 4: System.out.print("Enter 1st string: ");
						s1=br.readLine();
						System.out.print("Enter 2nd string: ");
						s2=br.readLine();
						System.out.println("\nThe strings are equal->(0) not equal->(-ve value):"+s1.compareTo(s2));
						break;
				case 5: System.out.print("Enter the string: ");
						s1=br.readLine();
						System.out.println("\nThe lowercase form: "+s1.toLowerCase());
						break;  
				case 6: System.out.print("\nEnter 1st string: ");
						sb1.append(s.nextLine());
						System.out.print("\nEnter 2nd string: ");
						sb2.append(s.nextLine());
						sb1.append(sb2);
						System.out.println("Appended string: " + sb1);
						break;
				case 7: System.out.print("\nEnter 1st string: ");
						sb1.append(s.nextLine());
						System.out.print("\nEnter 2nd string: ");
						sb2.append(s.nextLine());
				        System.out.print("\nEnter the position: ");
				        n=Integer.parseInt(br.readLine());
				        sb1.insert(n,sb2);						
						System.out.println("Inserted string: " + sb1);
						break;	
				case 8: System.out.print("\nEnter 1st string: ");
						sb1.append(s.nextLine());
						System.out.println("Capacity:" + sb1.capacity());
						System.out.print("\nEnter 2nd string: ");
						sb2.append(s.nextLine());
						sb1.append(sb2);
						System.out.println("Changed Capacity: " + sb1.capacity());
						break;
				case 9: System.out.print("\nEnter 1st string: ");
						sb1.append(s.nextLine());
				        System.out.print("\nEnter the start position: ");
				        n=Integer.parseInt(br.readLine());
				        System.out.print("\nEnter the start position: ");
				        int n2=Integer.parseInt(br.readLine());
				        sb1.delete(n, n2);						
						System.out.println("Resultant string: " + sb1);
						break;
				case 10:System.out.print("\nEnter 1st string: ");
						sb1.append(s.nextLine());
				        sb1.reverse();						
						System.out.println("Reversed string: " + sb1);
						break;																				
				default:System.out.println("Please enter a valid choice.");
						break;
			}
			System.out.print("\n\n\nDo u wish to continue?(y/n):");
			 ch=(char)br.read();
		}while(ch=='y' || ch=='Y');
	}
}
