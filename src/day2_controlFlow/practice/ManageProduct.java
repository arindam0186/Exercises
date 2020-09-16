package day2_controlFlow.practice;

public class ManageProduct {
	public double calculateDiscount(Product product) {
		
		double discount=0.0;
		
		if(product.getratePerUnit()>500 && product.getratePerUnit()<=1000)
			discount = 0.10;
		
		else if(product.getratePerUnit()>1000)
			discount = 0.15;
		
		return discount;
		
	}
	
	public double calculateTax(Product product) {
		int productType = product.getproductType();
		switch(productType) {
		case 1:
			return 5;
		case 2:
			return 10;
		case 3:
			return 15;
		default:
			return 28;
		}
	}
	
	public void showProducts() {
		for(int i=0;i<10;i++)
			System.out.println("Product");
	}
}
