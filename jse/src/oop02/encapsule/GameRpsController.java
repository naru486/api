package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		GameRpsService service=new GameRpsService();
		Scanner scanner=new Scanner(System.in);
		int playerValue =0;
		do{
			System.out.println("가위바위보 게임을 시작합니다.");
			System.out.println("1.가위, 2.바위, 3.보");
			playerValue = scanner.nextInt();
		}while(playerValue<1||playerValue>3);
		scanner.close();
		System.out.println("당신은 "+service.showRpsValue(playerValue)+"를 냈습니다.");
		int comValue=service.displayComValue();
		System.out.println("컴퓨터는 "+service.showRpsValue(comValue)+"를 냈습니다.");
		String winner=service.showWinner();
		System.out.println("컴퓨터가 이겼습니다.");
	}
}
