package mysteque1;



import java.util.Scanner;

public class BookTest {

	
	public static void main(String[] args) {
		System.out.println("How many books are there?");
		Scanner sc = new Scanner(System.in);
		int numberOfBooks = sc.nextInt();
		Book book = new Book(numberOfBooks);
		
		String bookName = "";
		sc = new Scanner(System.in);
		for(int i=0; i<numberOfBooks;i++) {
			System.out.println("Please enter the next book name");
					
			bookName = sc.nextLine();
			book.addFavoriteBook(bookName);
		}
		
		book.printFavoriteBooks();
		
	}
	

}
