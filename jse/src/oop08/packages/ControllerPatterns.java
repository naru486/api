package oop08.packages;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import oop02.encapsule.RpsController;

public class ControllerPatterns {
	public static void main(String[] args) {
		ControllerPatterns cp = new ControllerPatterns();
		RpsController rps=new RpsController();
		Scanner scanner = new Scanner(System.in);
		int flag = 0;
		do {
			System.out.println("���� ���μ��� ��ȣ�� �Է��ϼ���.");
			System.out.println("�Է��� ��ġ���� 0 �� �Է��ϼ���");
			flag = scanner.nextInt();
			
			switch (flag) {
			case 1:
				rps.main(args);
				break;
			case 2:
				rps.main(args);
				break;
			}
		} while (flag != 0);
	}
	
	public int getNumScanner(){
		int num=0;
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getNumScanner()���� ���� �߻�!!!");
		}
		return num;
	}
}
