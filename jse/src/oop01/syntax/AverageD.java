package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
		AverageService averageService=new AverageService();
		String user="��ũ";
		int kor=100;
		int eng=83;
		averageService.add(user, kor, eng);
		
		System.out.println("=== "+user+"�� ����ǥ ===");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+averageService.tot());
		System.out.println("��� : "+averageService.avg());
	}
}
