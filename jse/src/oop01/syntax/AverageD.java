package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
		AverageService averageService=new AverageService();
		String user="ÇæÅ©";
		int kor=100;
		int eng=83;
		averageService.add(user, kor, eng);
		
		System.out.println("=== "+user+"ÀÇ ¼ºÀûÇ¥ ===");
		System.out.println("±¹¾î : "+kor);
		System.out.println("¿µ¾î : "+eng);
		System.out.println("ÃÑÁ¡ : "+averageService.tot());
		System.out.println("Æò±Õ : "+averageService.avg());
	}
}
