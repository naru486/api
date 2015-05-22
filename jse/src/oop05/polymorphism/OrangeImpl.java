package oop05.polymorphism;

public class OrangeImpl implements FruitInterface {
	@Override
	public void display(String s) {
		System.out.println(s+" 오렌지입니다.");
	}
	public int getCount(){
		return 1000;
	}
}
