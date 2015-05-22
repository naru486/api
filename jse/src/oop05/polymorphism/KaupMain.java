package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		double height=scanner.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		double weight=scanner.nextDouble();
		scanner.close();
		/*
		KaupVO kaupVO=new KaupVO();
		kaupVO.setHeight(height);
		kaupVO.setWeight(weight);*/
		KaupInterface service =new KaupServiceImpl();
		service.getKaupIndex(height, weight);
		System.out.println(service.getResultMsg());
	}
}
