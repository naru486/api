package oop01.encapsule;

import java.util.Scanner;

public class NumberController { //scanner/ 결과출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberMatchService matchService=new NumberMatchService();
		System.out.println("1부터 3까지 정수만 입력하세요");
		matchService.game(scanner.nextInt());
	}
}
