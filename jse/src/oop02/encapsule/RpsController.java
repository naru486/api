package oop02.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		
		
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("1.����, 2.����, 3.��");
		Scanner scanner = new Scanner(System.in);
		int playerVal=scanner.nextInt();
		RpsService service=new RpsService(playerVal);
		System.out.println("�÷��̾�� "+service.showRpsVal(playerVal) +"�� �½��ϴ�.");
		int comVal=service.displayComVal();
		System.out.println("��ǻ�ʹ� "+service.showRpsVal(comVal) +"�� �½��ϴ�.");
		String winner=service.showWinner(playerVal,comVal);
		System.out.println("���� : "+winner);
	}
}
