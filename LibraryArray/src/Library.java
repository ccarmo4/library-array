

import java.util.Scanner;


public class Library {
	static int minCustomers = 100;
	static Customer[] customers = new Customer[1];
    static Book[] books = new Book[3];
    
	
	//Create a scanner object each for text and numbers
    private static Scanner fInput = new Scanner(System.in);
	private static Scanner lInput = new Scanner(System.in);
	private Object customer;
	private static Scanner tInput = new Scanner(System.in);
	private static Scanner nInput = new Scanner(System.in);
	private Object book;
	
	
	
	public static void main(String[] args) {
		
		
		
		addCustomers();
		

		for (int i = 0; i < customers.length; i++)
		{
			System.out.println(customers[i].getFname() + " " + customers[i].getLname());
		}
		
		
		//Add the books
				addBooks();
				
				for (int i = 0; i < books.length; i++ )
				{
					System.out.println(books[i].getTitle() + ", by " + books[i].getAuthor());
				}
				
				/*do 
				{
				System.out.println("What is the maximum amount of customers you expect?");
				} while (!(Integer.parseInt(tInput.nextLine())>=minCustomers));
				*/
		

		
		
	}
	
	private static void addCustomers()
	{
		for (int i = 0; i < customers.length; i++)
		{
			customers[i] = new Customer();
			System.out.println("Enter your First Name");
			customers[i].setFname(fInput.nextLine());
			System.out.println("Enter your Last Name");
			customers[i].setLName(lInput.nextLine());
		}
		
		
		
	} 
	
	private static void addBooks()
	{
		for (int i = 0; i < books.length; i++ )
		{
			books[i] = new Book();
			
			System.out.println("Enter a Book Name");
			
			books[i].setTitle(tInput.nextLine());
			
			System.out.println("Enter the Author's Name");
			
			books[i].setAuthor(tInput.nextLine());
			
		}
		

	}

}
