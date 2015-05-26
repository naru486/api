package oop09.nestedClass;

public class InnerClassStatic {
	int a=10;
	private int b=100;
	static int c=200;
	public static class Inner{
		static int d=1000;
		public void printData(){
			/*
			InnerClassStatic i=new InnerClassStatic();
			System.out.println("멤변 a : "+i.a);
			System.out.println("private b : "+i.b);
			*/
			/*
			System.out.println("멤변 a : "+a);
			System.out.println("private b : "+b);
			*/
			/*
			  a와 b 값이 에러가 나는 것은....
			  static 내부 클래스는 사실 더 이상의 내부클래스가 아니다.
			  또한 외부클래스 가지지 않고도 접근할 수 있다.
			  따라서 top level class 라고 하여 최상위 클래스라 한다.
			  어쩔 수 없이 내부 클래스를 static 으로 선언해야 하는 경우가 있다.
			  그건 바로 내부 클래스의 멤버들 중 하나라도
			  static 멤버가 잇을 경우이다.
			 * */
			System.out.println("static c : "+c);
			System.out.println("static d : "+d);
		}
	}

}
