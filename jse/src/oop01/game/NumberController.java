package oop01.game;

import java.util.Scanner;

public class NumberController { //scanner/ ������
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberMatchService matchService=new NumberMatchService();
		System.out.println("1���� 3���� ������ �Է��ϼ���");
		int scanInt=scanner.nextInt();
		matchService.game(scanInt);
	}
}
