package oop05.polymorphism;

import java.util.Scanner;


public class NumberMatchMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberMatchService matchService=new NumberMatchServiceImpl();
		System.out.println("0���� 1���� ������ �Է��ϼ���");
		int player=scanner.nextInt();
		matchService.makeComVal(player);
	    System.out.println(matchService.display());	
	}

}
