package majorProgam1;
import java.util.ArrayList;

public class bookDatabase {
	private ArrayList<book> books;
	
	//constructors
	public bookDatabase(ArrayList<book> books) {
		this.books = books;
	}
	public bookDatabase() {
		books = new ArrayList<book>();
	}
	
	//setter
	public void setbookDatabase(ArrayList<book> books) {
		this.books = books;
	}
	
	//getter
	public ArrayList<book> getbookDatabase() {
		return books;
	}
	
	//methods
	public void addBook(book book) {
		books.add(book);
	}
	public void removeBook(book book) {
		books.remove(book);
	}
	
	//search methods
	public ArrayList<book> search(Author author) {
		ArrayList<book> searchResult = new ArrayList<book>();
		for(book book : books) {
			Author bookAuthor = book.getAuthor();
			
			if(bookAuthor.getFirstName().equalsIgnoreCase(author.getFirstName()) && (bookAuthor.getLastName().equalsIgnoreCase(author.getLastName()))) {
				searchResult.add(book);
			}
			
		}
		return searchResult;
	}
	
	public ArrayList<book> search(int startYear, int endYear) {
		ArrayList<book> searchResult = new ArrayList<book>();
		for(book book : books) {
			
			if(book.getYear() >= startYear && book.getYear() <= endYear) {
				searchResult.add(book);
			
			}
		}
		return searchResult;
	}
		
	
	public ArrayList<book> search(String genre) {
		ArrayList<book> searchResult = new ArrayList<book>();
		for(book book : books) {
			
			if(book.getGenre().equalsIgnoreCase(genre)) {
				searchResult.add(book);
			}
		}
		return searchResult;
	
	}

}



















