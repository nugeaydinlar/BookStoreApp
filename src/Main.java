import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
    private static User  currentUser;
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<ABook> books = new ArrayList<ABook>();
   //Kitap 10

	public static void main(String[] args) {
		

		eBook ebook1 = new eBook("Sapiens: A Brief History of Humankind", 512, "Yuval Noah Harari", 2011, "Vintage", 14.99, BookTypes.HISTORY, 5.0);
		printedBook printedbook1 = new printedBook("Sapiens: A Brief History of Humankind", 512, "Yuval Noah Harari", 2011, "Vintage", 29.99, BookTypes.HISTORY, 987654, true);

		eBook ebook2 = new eBook("1984", 328, "George Orwell", 1949, "Signet Classics", 9.99, BookTypes.CLASSIC_FICTION, 2.0);
		printedBook printedbook2 = new printedBook("1984", 328, "George Orwell", 1949, "Signet Classics", 19.99, BookTypes.CLASSIC_FICTION, 123456, false);

		eBook ebook3 = new eBook("The Catcher in the Rye", 224, "J.D. Salinger", 1951, "Little, Brown and Company", 7.99, BookTypes.CLASSIC_FICTION, 2.5);
		printedBook printedbook3 = new printedBook("The Catcher in the Rye", 224, "J.D. Salinger", 1951, "Little, Brown and Company", 17.99, BookTypes.CLASSIC_FICTION, 135790, true);

		eBook ebook4 = new eBook("To Kill a Mockingbird", 281, "Harper Lee", 1960, "HarperCollins", 12.99, BookTypes.CLASSIC_FICTION, 3.2);
		printedBook printedbook4 = new printedBook("To Kill a Mockingbird", 281, "Harper Lee", 1960, "HarperCollins", 24.99, BookTypes.CLASSIC_FICTION, 246810, true);

		eBook ebook5 = new eBook("The Hobbit", 300, "J.R.R. Tolkien", 1937, "Houghton Mifflin Harcourt", 8.99, BookTypes.FANTASY, 4.0);
		printedBook printedbook5 = new printedBook("The Hobbit", 300, "J.R.R. Tolkien", 1937, "Houghton Mifflin Harcourt", 19.99, BookTypes.FANTASY, 86420, true);

		eBook ebook6 = new eBook("The Da Vinci Code", 592, "Dan Brown", 2003, "Anchor", 11.99, BookTypes.THRILLER, 2.7);
		printedBook printedbook6 = new printedBook("The Da Vinci Code", 592, "Dan Brown", 2003, "Anchor", 26.99, BookTypes.THRILLER, 753951, true);
		
		eBook ebook7 = new eBook("Sefiller", 1200, "Victor Hugo", 1862, "Gutenberg Projesi", 2.99, BookTypes.CLASSIC, 4.5);
		printedBook printedbook7 = new printedBook("Sefiller", 1200, "Victor Hugo", 1862, "Yapı Kredi Yayınları", 29.99, BookTypes.CLASSIC, 789012, true);
		
		eBook ebook8 = new eBook("Harry Potter and the Philosopher's Stone", 223, "J.K. Rowling", 1997, "Bloomsbury Publishing", 7.99, BookTypes.FICTION, 4.8);
		printedBook printedbook8 = new printedBook("Harry Potter and the Philosopher's Stone", 223, "J.K. Rowling", 1997, "Scholastic Press", 14.99, BookTypes.FICTION, 123456, false);
		
		eBook ebook9 = new eBook("The Lord of the Rings", 1178, "J.R.R. Tolkien", 1954, "HarperCollins", 9.99, BookTypes.FANTASY, 4.5);
		printedBook printedbook9 = new printedBook("The Lord of the Rings", 1178, "J.R.R. Tolkien", 1954, "Houghton Mifflin", 24.99, BookTypes.FANTASY, 345678, true);
		
		eBook ebook10 = new eBook("Pride and Prejudice", 432, "Jane Austen", 1813, "Project Gutenberg", 1.99, BookTypes.ROMANCE, 4.7);
		printedBook printedbook10 = new printedBook("Pride and Prejudice", 432, "Jane Austen", 1813, "Penguin Classics", 12.99, BookTypes.ROMANCE, 567890, false);
			
	
		books.addAll(Arrays.asList(ebook1, ebook2, ebook3, ebook4, ebook5, ebook6, ebook7, ebook8, ebook9, ebook10, 
				printedbook1, printedbook2, printedbook3, printedbook4, printedbook5, printedbook6, printedbook7, printedbook8, printedbook9, printedbook10));

		
		
		
		boolean isExit = true;
		
		
		while(isExit) {
			
			System.out.println("***** Book Store *****");
            System.out.println("Please login to the system to see the options.");
			
            if (currentUser == null) {
                System.out.println("1. Create an account");
                System.out.println("2. Log in");
            } else {
                System.out.println("1. Search Book");
                System.out.println("2. Add product to  basket");
                System.out.println("3. Checkout");
                System.out.println("4. Log out");
            }
            System.out.println("0. Exit");
            System.out.print("Please select an option: ");
            

            int option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 0:
                    isExit = false;
                    break;
                case 1:
                    if (currentUser == null) {
                   	 createUser(users);
                    } else {
                   	 searchBook();
                    }
                    break;
                case 2:
                    if (currentUser == null) {
                        currentUser = login();
                    } else {
                        addToBasket();
                    }
                    break;
                case 3:
                	checkout();
                	break;
                case 4 :
                	currentUser = null;
                	break;
                default:
                	System.out.println("Invalid parameter. Please enter the number");

		}
	}
	}
    public static User login() {
    	
    	System.out.println("Please enter your username: ");
        String usernameString =  scanner.nextLine();
        System.out.println("Please enter your password: ");
        String passwordString =  scanner.nextLine();
        
        if(users.size() == 0) {
        	System.out.println("There is no account in system.");
        	System.out.println();
        }
        else {
        for(User user : users ) {
        	if(usernameString.equals(user.getUsername()) && passwordString.equals(user.getPassword())) {
        		System.out.println("Successful entered");
        		System.out.println();
        		return user;
        	}
        	else {
        		System.out.println("Incorret passord or username");
        	}
        }	 
    }
        return null;
    }
    public static void createUser(ArrayList<User> users) {
    	System.out.println("Please enter your username: ");
        String usernameString =  scanner.nextLine();
        System.out.println("Please enter your password: ");
        String passwordString =  scanner.nextLine();
        System.out.println("Please enter your email: ");
        String emailString =  scanner.nextLine();
        User user1  = new User(usernameString, passwordString, emailString);
        users.add(user1);
    }
    
    public static void  searchBook() {
    	
    	boolean isFound = true;
    	
    	System.out.println("Enter the name of the book/author you are looking for: ");
    	String searchingBook = scanner.nextLine();
    	
    	for(ABook book : books) {
        	if(searchingBook.equalsIgnoreCase(book.getName()) || searchingBook.equalsIgnoreCase(book.getAuthor())) {
        		
        	isFound = false;
        	
        		if(book.isPrinted())
        			System.out.println(book.getAuthor() + "'s " + book.getName() + " named book found");

        		else 
					System.out.println(book.getAuthor() + "'s " + book.getName() + " named e-book found");	
    	}  
    	}
    	
    	System.out.println();
    	
    	if(isFound) {
			System.out.println(searchingBook + "named book not found.");
		}
	
    }
    
    
    public static void  addToBasket() {
    	
    	
    	
    	
    }
    public static void  checkout() {
    	
    }    
		
    

}
