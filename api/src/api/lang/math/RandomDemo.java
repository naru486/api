package api.lang.math;

import java.util.Scanner;

/*
 * java.lang.Math 에 속한
 * random() 메소드는 난수를 생성시키는 기능을 한다.
 * */
public class RandomDemo {
	public static void main(String[] args) {
		int com=(int)(Math.random()*5)+1;
		/*
		 * 위 예제에서 5는 limit 값이고 1은 begin 값이다.
		 * 따라서 위 예제는 1부터 5까지 난수(랜덤숫자)를
		 * 발생시키라는 구문이다.
		 * */
		int myVal;
		Scanner scanner=new Scanner(System.in);
		int i = 0;
		while (true) {
			i++;
			System.out.println("1부터 5까지의 숫자 맞추기 입니다.");
			System.out.println("현재는 "+i+" 번째 시도입니다.");
			myVal=scanner.nextInt();
			if (myVal==com) {
				System.out.println("컴퓨터가 발생 한 숫자 : "+com);
				System.out.println("빙고~ 정답 입니다.");
				break;
			}
			if(i==3){
				System.out.println("실패입니다.");
				break;
			}
		}
	}
}
