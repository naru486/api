package oop03.inheritance;
/*
Date : 2015/05/20
Author : ��ȣ��
Desc :	�޼ҵ� ���  
*/
/*
 Car
 �� ��� 
 Hcar �� new ( instantiate ) 
 * */

class Car2{
	String name="�ڵ���";
	public String gear(){
		return "�������";
	}
}

class Hcar2 extends Car2{
	String brand="������";
	@Override
	public String gear(){
		return "";
	}
	public String autogear(){
		return "�ڵ����";
	}
}

public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 hcar2 = new Hcar2();
		System.out.println(hcar2.gear());
		System.out.println(hcar2.autogear());
		
		Car2 car2=new Car2();
		System.out.println(car2.gear());
	//	System.out.println(car2.autogear());
    //  ����Ͽ� ���� �� �ִ� ������ �ڽĸ� �����ϴ�.
	}
}
