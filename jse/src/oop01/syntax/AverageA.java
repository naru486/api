package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	
	public static void main(String[] args) {
		// tot, avg 지역변수를 선언하시고
		// 아래와 같이 출력되도록 해주세요.
		AverageA averageA=new AverageA();
		int tot=0;
		double avg=0;
		
		averageA.name="헐크";
		averageA.kor=100;	
		averageA.eng=82;	
		System.out.println("==="+averageA.name+"의 성적표===");
		System.out.println("국어 : "+averageA.kor+"점");
		System.out.println("영어 : "+averageA.eng+"점");
		tot=averageA.kor+averageA.eng;
		avg=tot/2.0;
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		System.out.println("==="+averageA.name+"의 성적표===");
		averageA.name="아이언맨";
		averageA.kor=94;	
		averageA.eng=45;	
		System.out.println("국어 : "+averageA.kor+"점");
		System.out.println("영어 : "+averageA.eng+"점");
		tot=averageA.kor+averageA.eng;
		avg=(double)tot/2;
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		System.out.println("==="+averageA.name+"의 성적표===");
		averageA.name="토르";
		averageA.kor=44;	
		averageA.eng=25;	
		System.out.println("국어 : "+averageA.kor+"점");
		System.out.println("영어 : "+averageA.eng+"점");
		tot=averageA.kor+averageA.eng;
		avg=tot/2d;
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
	}
}
