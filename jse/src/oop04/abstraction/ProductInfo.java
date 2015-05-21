package oop04.abstraction;

public abstract class ProductInfo {
	protected String productCompany;
	protected String productName;
	protected String productSerialID;
	
	public void setProductInfo(String productCompany,String productName, String productSerialID){
		this.productCompany=productCompany;
		this.productName=productName;
		this.productSerialID=productSerialID;
	}
	
	public abstract void displayProductInfo();
}
