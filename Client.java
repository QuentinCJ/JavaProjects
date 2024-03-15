package majorProgam1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		//ArrayList<String> lines = new ArrayList<String>();
		FileReader files = new FileReader("MP1.csv");
		Scanner scnr = new Scanner(files);
		String header = scnr.nextLine();
		ArrayList<book> books = new ArrayList<book>();
		
		while(scnr.hasNextLine()) {
			String line = scnr.nextLine();
			String[] bookData = line.split(",");
			String price = bookData[7];
			price = price.replace("$", "");
			double bookPrice = Double.parseDouble(price);
			double bookRating = Double.parseDouble(bookData[6]);
			int bookYear = Integer.parseInt(bookData[3]);
			Author bookAuthor = new Author(bookData[0], bookData[1]);
			book newBook = new book(bookAuthor, bookData[2], bookYear, bookData[4], bookData[5], bookRating, bookPrice);
			books.add(newBook);
		
		}
		//Create book database
		bookDatabase library = new bookDatabase(books);
		ArrayList<book> books1999 = library.search(1999, 2010);
		System.out.println("Number of books between 1999 and 2010: " + books1999.size());
		System.out.println("");
		
		
		Author tMartin = new Author("Tony", "Martin");
		ArrayList<book> tMartinBooks = library.search(tMartin);
		System.out.println("Books that belong to Tony Martin: ");
		for(book martinBooks : tMartinBooks) {
			System.out.println(martinBooks.toString());
			System.out.println("");
		
		}
		
		ArrayList<book> travelBooks = library.search("Travel");
		System.out.println("Books under the travel genre: ");
		for(book travBooks : travelBooks) {
			System.out.println(travBooks.toString());
		}
		
	}

}
