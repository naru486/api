package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	/*
	 * ����
	 * income = salary - tax;
	 * 
	 * PayVO : getter, setter
	 * PayService : ��� ����
	 * PayController : ����¸�
	 *  �� ���� �����ϼ���
	 * �̸��� �޿��� �Է¹޾Ƽ�
	 * ���� �� �� �ҵ��� ���ϴ� Logic
	 * */
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name=scanner.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		int salary=scanner.nextInt();
		
		scanner.close();
		PayService payService=new PayService();
		
		System.out.println("==== �޿����� ====");
		System.out.println("���� : "+name);
		System.out.println("���� : "+salary);
		System.out.println("���� : "+payService.taxCalculator(salary));
		System.out.println("�Ǽ��ɾ� : "+payService.incommCalculator(salary));
	}
}
