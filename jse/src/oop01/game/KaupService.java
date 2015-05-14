package oop01.game;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		KaupVO vo = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double height=scanner.nextDouble();
		vo.setHeight(height);
		System.out.print("몸무게를 입력하세요 : ");
		double weight=scanner.nextDouble();
		vo.setWeight(weight);
		vo.setIdx(weight, height);
		vo.setMsg("");
		scanner.close();		
		System.out.println(vo.toString());
		System.out.println("완료");
	}
}
