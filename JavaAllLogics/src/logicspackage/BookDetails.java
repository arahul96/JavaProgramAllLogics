package logicspackage;

class BookData{
	String bCode, bName, bAuthor;
	int bPrice, bQty;
	void bData() {
		System.out.println("Book Code =" +bCode);
		System.out.println("Book Name ="+bName);
		System.out.println("Book Author =" +bAuthor);
		System.out.println("Book Price ="+bPrice);
		System.out.println("Book Quantity ="+bQty);
	}
}

public class BookDetails {

	public static void main(String[] args) {
		BookData bd = new BookData();
		bd.bCode = "A01";
		bd.bName = "Indian";
		bd.bAuthor = "Roy";
		bd.bPrice = 999;
		bd.bQty = 100;
		bd.bData();
	}

}
