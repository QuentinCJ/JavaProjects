package majorProgam1;

public class book {
	//declarations of variables
	private Author author;
	private String title;
	private int year;
	private String publisher;
	private String genre;
	private double rating;
	private double price;
	//constructors
	public book(Author author, String title, int year, String genre, String publisher, double rating, double price) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.genre = genre;
		this.rating = rating;
		this.price = price;
	}
	
	public book() {
		author = null;
		title = "";
		year = 0;
		publisher = "";
		genre = "";
		rating = 0;
		price = 0;
	}
	//setters
	public void setAuthor(Author author) {
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//getters
	public Author getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getGenre() {
		return genre;
	}
	public double getRating() {
		return rating;
	}
	public double getPrice() {
		return price;
	}

	
	public String toString() {
		return "Author: " + author.getFirstName() + " " + author.getLastName() + ", " + "Title: " + title + ", " +
	"Year: " + year + ", " + "Publisher: " + publisher + ", " +
	"Genre: " + genre + ", " + "Rating; " + rating + ", " +
	"Price: " + price + ".";			
	}
}











