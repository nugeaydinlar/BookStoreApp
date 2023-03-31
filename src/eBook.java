
public class eBook extends ABook{

	private double fileSize;
	
	
	public eBook(String name, int pageNumber, String author, int year, String publisher, double price, BookTypes booktype, double fileSize) {
		super(name, pageNumber, author, year, publisher, price, booktype, false);
		this.fileSize = fileSize;
	;
		
	}

	
	public String getFileSize() {
		return fileSize + "mb";
	}


	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}


	@Override
	public void sellBook() {
		System.out.println(super.getName() + " adli kitap " + super.getPrice() + " TL'ye satilmistir.");
		
	}


	@Override
	public void readBook() {
		System.out.println(super.getName() + " adli kitabi okuyorsunuz.");
	}
	

}
