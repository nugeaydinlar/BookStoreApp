import javax.management.remote.SubjectDelegationPermission;

public class printedBook extends ABook{

	private int barcodeNo;
	private boolean isBinding;
	
	public printedBook(String name, int pageNumber, String author, int year, String publisher, double price, BookTypes booktype, int barcodeNo, boolean isBinding) {
		super(name, pageNumber, author, year, publisher, price, booktype, true);
		this.barcodeNo = barcodeNo;
		this.isBinding = isBinding;
		
	}

	public int getBarcodeNo() {
		return barcodeNo;
	}

	public void setBarcodeNo(int barcodeNo) {
		this.barcodeNo = barcodeNo;
	}

	public boolean isBinding() {
		return isBinding;
	}

	public void setBinding(boolean isBinding) {
		this.isBinding = isBinding;
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
