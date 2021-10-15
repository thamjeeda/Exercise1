package mysteque1;



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
	
	private String[] favoriteBooks;
	private String[] totalBooks;
    private int index;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int totalBooks) {
		super();
		this.totalBooks =new String[totalBooks];
	}



	public String[] getFavoriteBooks() {
		return favoriteBooks;
	}

	public void setFavoriteBooks(String[] favoriteBooks) {
		this.favoriteBooks = favoriteBooks;
	}



	public String[] getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(String[] totalBooks) {
		this.totalBooks = totalBooks;
	}

	public void addFavoriteBook(String bookName) {
		boolean flag = false;
		String bookNameWords[] = bookName.split(" ");
		for(int i=0; i<bookNameWords.length;i++) {
			if("Great".equals(bookNameWords[i])) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			this.totalBooks[index] = bookName;
			index++;
		}
	}

	public void printFavoriteBooks() {
		List<String> favouriteBookNames = Arrays.stream(totalBooks).filter(bookName->bookName!=null).collect(Collectors.toList());
		favoriteBooks = new String[favouriteBookNames.size()];
		int index = 0;
		System.out.println(favouriteBookNames.size());
		for(Iterator<String> it = favouriteBookNames.iterator();it.hasNext();) {
			favoriteBooks[index] = it.next();
			index++;
		}
		System.out.println("Favorite Books:  "+favoriteBooks.length);
		for(int i=0; i<favoriteBooks.length;i++) {
			System.out.println(favoriteBooks[i]);
		}
		
	}
}
