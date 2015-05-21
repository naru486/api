package oop04.abstraction;

public class ProductInfoClass implements ProductInterface {
	private String company;
	private String name;
	private String sid;
	public void setInfo(String company,String name,String sid){
		this.company=company;
		this.name=name;
		this.sid=sid;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("회사 : "+this.company);
		System.out.println("이름 : "+this.name);
		System.out.println("ID   : "+this.sid);
	}

}
