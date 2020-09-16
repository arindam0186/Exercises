package day2_controlFlow.practice;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product tv = new Product(1010,"LED TV",23000.00,3);
		ManageProduct mgr = new ManageProduct();
		
		double discount = mgr.calculateDiscount(tv);
		double taxPercentage = mgr.calculateTax(tv);
		
//		mgr.showProducts();
		
		System.out.println("Discount ==> "+discount);
		System.out.println("Tax Percentage ==> "+taxPercentage);
	}

}
