package api.lang.wrapper;
/*
 JDK 1.5 (자바버전 5)부터 도입 된 오토박싱(auto boxing) 기능으로
 반환값이 기변형일 경우와 wrapper class 이면...
 서로 차이가 없다.
 그래서 parseInt() 와 valueOf() 가 차이가 없다.
 * */

public class ParseIntDemo {
	public static void main(String[] args) {
		// 리터럴 값을 기본형으로 캐스팅 변환방법
		// 즉, String → int
		int num1=Integer.parseInt("200");
		int num2=Integer.parseInt("200");
		int result=num1+num2;
		System.out.println(result);
		
		// 기본형을 참조형으로 형변환하는 경우(캐스팅 생략 가능)
		//Integer num3=(Integer)result;
		Integer num3=result;
		System.out.println("기본형을 참조형으로 형변환한 결과 : "+num3);
		
		int num4=2+num3;
		System.out.println("참조형과 기본형간의 연산 결과 : "+num4);
		
		//int num5=Integer.parseInt("Hello");
		/*
		 * num5 는 java.lang.NumberFormatException: 이 발생한다.
		 * 이 경우라면 문자값을 숫자형으로 형변환을 시도했는지 여부를
		 * 고민하고 디버깅 해야 한다.
		 * */
	}
}
