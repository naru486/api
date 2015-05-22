package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int playerVal;
		do {
			System.out.println("가위바위보 게임을 시작합니다.");
			System.out.println("1.가위, 2.바위, 3.보");

			playerVal = scanner.nextInt();

		} while (playerVal < 1 || playerVal > 3);
		scanner.close();
		RpsService service = new RpsServiceImpl();
		System.out.println("플레이어는 " + service.showRpsVal(playerVal) + "를 냈습니다.");
		int comVal = service.displayComVal();
		System.out.println("컴퓨터는 " + service.showRpsVal(comVal) + "를 냈습니다.");
		String winner = service.showWinner(playerVal, comVal);
		System.out.println("승자 : " + winner);
	}
}
