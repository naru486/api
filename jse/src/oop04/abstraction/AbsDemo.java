package oop04.abstraction;
/*
Date : 2015/05/21
Author: 김호영
Desc : 추상 클래스 예시
*/
public class AbsDemo {
	public static void main(String[] args) {
		Sum01 sum01=new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println(sum01.toString());
		
		Sum02 sum02 =new Sum02();
		System.out.println(sum02.sum(10, 20));
		System.out.println(sum02.toString());
	}
}

abstract class AbsSum {
	// 필수적으로 강제성이 있는 메소드
	public abstract String toString();

	public String sum(int i, int k) {
		int sum = i + k;
		return "" + sum;
		// int 리턴을 String 반환값 주는 방법
	}
}

class Sum01 extends AbsSum {
	@Override
	public String toString() {
		return "class Sum01 extends AbsSum";
	}
}

class Sum02 extends AbsSum{
	@Override
	public String toString() {
		return "class Sum02 extends AbsSum";
	}
}