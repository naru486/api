package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo {
	
	int big;
	
	public void getBig(int a,int b,int c){
		if(a>b && a >c){
			System.out.println("���� ū ���� A���� "+a+" �Դϴ�.");
		}else if(b>a && b>c){
			System.out.println("���� ū ���� B���� "+b+" �Դϴ�.");
		}else if(c>a && c>b){
			System.out.println("���� ū ���� C���� "+c+" �Դϴ�.");
		}
		
	}
	
	public static void main(String[] args) {
		/*
		No02_IfElseDemo instance = new No02_IfElseDemo();
		Scanner scan=new Scanner(System.in);
		System.out.print("A ���� �Է��ϼ��� : ");
		int a=scan.nextInt();
		
		System.out.print("B ���� �Է��ϼ��� : ");
		int b=scan.nextInt();
		
		System.out.print("C ���� �Է��ϼ��� : ");
		int c=scan.nextInt();
		
		scan.close();
		instance.getBig(a, b, c);
*/
		String s=new String("gaev");
		s="gaev";
		String k=s.substring(1, 2);
		
		System.out.println(k);
		//System.out.println(i);
		
		
	}
}
