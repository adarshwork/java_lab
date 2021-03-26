//MCABookRepo
import java.io.*;
class Book
{
	int i, bookid, year;
	String bookname, catg;
	Book(String bookname, int bookid, String catg, int year)
	{
		this.bookname=bookname; 
		this.bookid=bookid;
		this.catg=catg;
		this.year=year;
	}

	public void display()
	{
		System.out.println("Book Name: " + bookname);
		System.out.println("Book ID: " + bookid);
		System.out.println("Category: " + catg);
		System.out.println("Year of publishing: " + year);
		System.out.println("********************************");
	}
}

class mcabookrepo
{
	static
	{
		System.out.println("2047203 - ADARSH JHUNJHUNWALA");
	}
	public static void main(String args[]) throws IOException
	{
		int i, choice, bookid=000000, year=2020, addsize, s_bid, s_choice, ob_count=0;
		double r;
		String bookname="CS", catg="theory", s_bname;
		Book obj[]=new Book[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("\n1.Add\n2.Display\n3.Search\n4.Exit\nEnter your choice: ");
			choice=Integer.parseInt(br.readLine());

			switch(choice)
			{
				case 1: System.out.print("Enter the no. of books you want to add: ");
						addsize=Integer.parseInt(br.readLine());
						if(addsize<=0 || addsize>10)
						{
							System.out.println("You cannot insert <=0 or > 10 books");
							break;
						}
						ob_count+=addsize;
						for(i=0;i<addsize;i++)
						{
							System.out.print("\nEnter Book Name: ");
							bookname=br.readLine();
							r= Math.random()*1000000;
					    	bookid=(int) r;
							System.out.print("Enter Category: ");
							catg=br.readLine();
							if(!(catg.toUpperCase().equals("THEORY") || catg.toUpperCase().equals("PROGRAMMING")))
							{
								System.out.println("Only Theory and Programming categories are allowed!");
								i--;
								continue;	
							}
							System.out.print("Enter Year of Publishing: ");
							year=Integer.parseInt(br.readLine());
							if (!(year >= 2015 && year <= 2021))
							{
								System.out.println("Year of Publishing must be between 2015-2021");
								i--;
								continue;
							}

							obj[i]=new Book(bookname.toUpperCase(), bookid, catg, year);
						}
						break;
				case 2:
						System.out.println("\n\n********Book Details*********\n\n");
						for(i=0;i<ob_count;i++)
						{
							obj[i].display();
						} 
						break;
				case 3:	System.out.print("\n1.Search using Book ID\n2.Search using Book Name\nEnter your choice: ");
						s_choice=Integer.parseInt(br.readLine());
						switch(s_choice)
						{
							case 1: 						
									for(i=0; i<10; i++)
									{
										System.out.print("\nEnter Book Id: ");
										s_bid=Integer.parseInt(br.readLine());
										if(s_bid != obj[i].bookid)
										{
											System.out.println("Book not found");
											break;
										}
										else
										{
											System.out.println("Book found");
											obj[i].display();
											break;
										}
									}
									break;
							case 2: 
									for(i=0; i<10; i++)
									{
										System.out.print("\nEnter Book Name: ");
										s_bname=br.readLine();
										if(!s_bname.toUpperCase().equals(obj[i].bookname))
										{
											System.out.println("Book not found");
											break;
										}
										else
										{
											System.out.println("Book found");
											obj[i].display();
											break;
										}
									}
									break;
							default: 
									System.out.println("Please enter a valid choice");
									break;
						}

						break;
				case 4: 
						System.out.println("Exiting program now.....");
						System.exit(0);
				default: 
						System.out.println("Please enter a valid choice");
						break;
			}
		}while(choice!=4);
	}
}