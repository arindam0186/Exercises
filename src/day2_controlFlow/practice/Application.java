package day2_controlFlow.practice;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product tv = new Product(1010,"LED TV",23000.00,3,10,0);
		ManageProduct mgr = new ManageProduct();
		
//		double discount = mgr.calculateDiscount(tv);
//		double taxPercentage = mgr.calculateTax(tv);
		
//		mgr.showProducts();
		
		Product fridge = new Product();
		fridge.setproductId(200);
		fridge.setproductName("Fridge");
		fridge.setratePerUnit(12030);
		fridge.setQuantity(100);
		fridge.setDiscount(0);
		
//		System.out.println("Discount ==> "+discount);
//		System.out.println("Tax Percentage ==> "+taxPercentage);
		
		Product[] productList = new Product[2];
		productList[0] = tv;
		productList[1] = fridge;
		
		productList = mgr.calculateDiscount(productList);
		
//		mgr.showProductForEach(productList);
		mgr.showProductsLegacy(productList);
		
	}

}
