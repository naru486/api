package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	/*
	 * 공식
	 * income = salary - tax;
	 * 
	 * PayVO : getter, setter
	 * PayService : 계산 로직
	 * PayController : 입출력만
	 *  세 개로 분할하세요
	 * 이름과 급여는 입력받아서
	 * 세율 뺀 실 소득을 구하는 Logic
	 * */
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name=scanner.nextLine();
		System.out.print("본봉을 입력하세요 : ");
		int salary=scanner.nextInt();
		
		scanner.close();
		PayService payService=new PayService();
		
		System.out.println("==== 급여내역 ====");
		System.out.println("성명 : "+name);
		System.out.println("본봉 : "+salary);
		System.out.println("세금 : "+payService.taxCalculator(salary));
		System.out.println("실수령액 : "+payService.incommCalculator(salary));
	}
}
