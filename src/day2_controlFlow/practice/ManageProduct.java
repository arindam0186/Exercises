package day2_controlFlow.practice;

public class ManageProduct {
	public Product[] calculateDiscount(Product[] productList) {
		
		for(Product eachProduct: productList) {
			double discount=0.0;
			
			if(eachProduct.getratePerUnit()>500 && eachProduct.getratePerUnit()<=1000)
				discount = 0.10;
			
			else if(eachProduct.getratePerUnit()>1000)
				discount = 0.15;
			
			eachProduct.setDiscount(discount);
			
		}
		
		return productList;
		
	}
	
//	public double calculateTax(Product product) {
//		int productType = product.getproductType();
//		switch(productType) {
//		case 1:
//			return 5;
//		case 2:
//			return 10;
//		case 3:
//			return 15;
//		default:
//			return 28;
//		}
//	}
	
	public void showProductsLegacy(Product[] productList) {
		for(int i=0;i<productList.length;i++) {
			System.out.println("Product: "+i+" => "+productList[i].getproductName());
			System.out.println(productList[i].getQuantity()*(productList[i].getratePerUnit()-productList[i].getratePerUnit()*productList[i].getDiscount()));
		}
	}
	
//	public void showProductForEach(Product[] productList) {
//		for(Product eachProduct: productList)
//			System.out.println(eachProduct.getproductName()+" : "+eachProduct.getratePerUnit());
//	}
}
