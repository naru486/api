package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height=scanner.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
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
