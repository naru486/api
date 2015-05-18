package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor,eng;
	
	// getter setter 사용하지 말고 
	// 생성자로 처리
	// 단, avg(), tot()은 작성
	
	public AverageEVO(){} // default 생성자 직접 작성
	
	public AverageEVO(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	private double avg(){
		return total()/2d;
	}
	
	private int total(){
		return kor+eng;
	}
	
	private String name(){
		return name;
	}
	
	@Override
	public String toString(){
		return "=== "+name()+"의 성적표 ===\n"
					+"국어 : "+kor+" 점\n"
					+"영어 : "+eng+" 점\n"
					+"총점 : "+total()+" 점\n"
					+"평균 : "+avg()+ "점\n";
	}
}
