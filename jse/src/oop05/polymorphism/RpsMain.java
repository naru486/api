package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int playerVal;
		do {
			System.out.println("���������� ������ �����մϴ�.");
			System.out.println("1.����, 2.����, 3.��");

			playerVal = scanner.nextInt();

		} while (playerVal < 1 || playerVal > 3);
		scanner.close();
		RpsService service = new RpsServiceImpl();
		System.out.println("�÷��̾�� " + service.showRpsVal(playerVal) + "�� �½��ϴ�.");
		int comVal = service.displayComVal();
		System.out.println("��ǻ�ʹ� " + service.showRpsVal(comVal) + "�� �½��ϴ�.");
		String winner = service.showWinner(playerVal, comVal);
		System.out.println("���� : " + winner);
	}
}
