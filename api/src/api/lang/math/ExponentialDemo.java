package api.lang.math;
/*
 * java.lang.Math 에 있는
 * 수리영역 계산 공식을 
 * 메소드화 시킨 부분이다.
 * */
public class ExponentialDemo {
	public static void main(String[] args) {
		double x=11.635;
		double y=2.78;
		/*
		 * C 언어에서 사용하는 printf() 함수를
		 * 그대로 차용한 것으로 아래 예제는 소수점 이하 4자리가지 출력하라는 지시이다.
		 * */
		System.out.printf("The value of "+"e is %.4f%n",Math.E);
	}
}
