package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		/*
		int kor; // 선언 Declation
		kor=90; // 할당 Allocation
		*/
		int kor=90,eng=85,sum=0;
		sum = kor + eng;
		System.out.print("성적처리\n");
		System.out.println("국어 영어 합계");
		System.out.println("kor	eng	sum");
		System.out.printf("%d\t%d\t%d\n",kor,eng,sum);
	}
}
