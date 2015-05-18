package oop01.syntax;

public class AverageB  {
	
	String name;
	int kor,eng;
	
	/*메소드를 여기에 정의하셔서
	 * 메소드의 객체화를 해주세요
	 */

	public int tot(){
		int result=kor+eng;
		return result;
	}
	
	public double avg(){
		double result=tot()/2d;
		return result;
	}
	
	public static void main(String[] args) {
		AverageB averageB=new AverageB();
		averageB.name="헐크";
		averageB.kor=100;	
		averageB.eng=83;	
		System.out.println("==="+averageB.name+"의 성적표===");
		System.out.println("국어 : "+averageB.kor+"점");
		System.out.println("영어 : "+averageB.eng+"점");
		System.out.println("총점 : "+averageB.tot()+"점");
		System.out.println("평균 : "+averageB.avg()+"점");
	}
}
