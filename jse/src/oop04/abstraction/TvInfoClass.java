package oop04.abstraction;

public class TvInfoClass extends ProductInfoClass{
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company,String name
			,String sid,String screenSize
			,String screenType){
		// 구현
		super.setInfo(company, name, sid);
		this.screenSize=screenSize;
		this.screenType=screenType;
	}
	
	public void displayInfo(){
		// 구현
		super.displayInfo();
		System.out.println("인치 정보 : "+this.screenSize);
		System.out.println("화면 종류 : "+this.screenType);
	}
}
