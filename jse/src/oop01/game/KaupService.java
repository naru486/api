package oop01.game;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		KaupVO vo = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height=scanner.nextDouble();
		vo.setHeight(height);
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight=scanner.nextDouble();
		vo.setWeight(weight);
		vo.setIdx(weight, height);
		vo.setMsg("");
		scanner.close();		
		System.out.println(vo.toString());
		System.out.println("�Ϸ�");
	}
}
