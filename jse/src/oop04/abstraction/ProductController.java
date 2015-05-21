package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci =new ComputerInfo();
		ci.setComputerInfo("삼성", "센스", "a-1234-4567", "dual-core", "8G","500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		// set 메소드 호출
		// TV 정보는 
		// 회사 : LG
		// 제품명 : xcanvas
		// 제품ID : x-1234
		// 화면사이즈 : 42인치
		// 화면비율 : 16:9
		ti.setTvInfo("LG", "XCANVAS", "x-1234", "42인치", "16:9");
		ti.displayProductInfo();
	}
}
