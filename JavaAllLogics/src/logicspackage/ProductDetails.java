package logicspackage;

class Product{
	String pCode, pName;
	int pPrice, pQty;
	void pProduct() {
		System.out.println("Product Code =" +pCode);
		System.out.println("Product Name ="+pName);
		System.out.println("Product Price ="+pPrice);
		System.out.println("Product Quantity ="+pQty);
	}
}

public class ProductDetails {

	public static void main(String[] args) {
		Product pd = new Product();
		pd.pCode = "A01";
		pd.pName = "Car";
		pd.pPrice = 10000;
		pd.pQty = 4;
		pd.pProduct();
	}

}
