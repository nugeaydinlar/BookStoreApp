
public abstract class ABook implements Book{
	
	private String name;
	private int pageNumber;
	private String author;
	private int year;
	private String publisher;
	private double price;
	private BookTypes booktype;
	private boolean isPrinted;
	
	
	public ABook(String name, int pageNumber, String author, int year, String publisher, double price,BookTypes booktype, boolean isPrinted) {
		
		this.booktype = booktype;
		this.name = name;
		this.pageNumber = pageNumber;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.price = price;
		this.isPrinted = isPrinted;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public boolean isPrinted() {
		return isPrinted;
	}
	
	public void setPrinted(boolean isPrinted) {
		this.isPrinted = isPrinted;
	}


	

}
