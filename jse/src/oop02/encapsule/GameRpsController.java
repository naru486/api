package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		GameRpsService service=new GameRpsService();
		Scanner scanner=new Scanner(System.in);
		int playerValue =0;
		do{
			System.out.println("���������� ������ �����մϴ�.");
			System.out.println("1.����, 2.����, 3.��");
			playerValue = scanner.nextInt();
		}while(playerValue<1||playerValue>3);
		scanner.close();
		System.out.println("����� "+service.showRpsValue(playerValue)+"�� �½��ϴ�.");
		int comValue=service.displayComValue();
		System.out.println("��ǻ�ʹ� "+service.showRpsValue(comValue)+"�� �½��ϴ�.");
		String winner=service.showWinner();
		System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	}
}
