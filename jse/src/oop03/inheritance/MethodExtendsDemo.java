package oop03.inheritance;
/*
Date : 2015/05/20
Author : 김호영
Desc :	메소드 상속  
*/
/*
 Car
 ↑ 상속 
 Hcar ← new ( instantiate ) 
 * */

class Car2{
	String name="자동차";
	public String gear(){
		return "수동기어";
	}
}

class Hcar2 extends Car2{
	String brand="현대차";
	@Override
	public String gear(){
		return "";
	}
	public String autogear(){
		return "자동기어";
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
    //  상속하여 받을 수 있는 로직은 자식만 가능하다.
	}
}
