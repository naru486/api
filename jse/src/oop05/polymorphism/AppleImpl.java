package oop05.polymorphism;

public class AppleImpl implements FruitInterface {
	
	@Override
	public void display(String s) {
		System.out.println(s+" 사과입니다.");
	}
}
