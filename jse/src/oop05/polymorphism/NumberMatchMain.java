package oop05.polymorphism;

import java.util.Scanner;


public class NumberMatchMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumberMatchService matchService=new NumberMatchServiceImpl();
		System.out.println("0부터 1까지 정수만 입력하세요");
		int player=scanner.nextInt();
		matchService.makeComVal(player);
	    System.out.println(matchService.display());	
	}

}
