package day2_controlFlow.practice;

public class Product {

	private int productId;
	private String productName;
	private double ratePerUnit;
	private int productType;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, double ratePerUnit, int productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
	}
	public int getproductId() {
		return productId;
	}
	public void setproductId(int productId) {
		this.productId = productId;
	}
	public String getproductName() {
		return productName;
	}
	public void setproductName(String productName) {
		this.productName = productName;
	}
	public double getratePerUnit() {
		return ratePerUnit;
	}
	public void setratePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public int getproductType() {
		return productType;
	}
	public void setproductType(int productType) {
		this.productType = productType;
	}
	
}
