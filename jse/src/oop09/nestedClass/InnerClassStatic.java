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
			System.out.println("�⺯ a : "+i.a);
			System.out.println("private b : "+i.b);
			*/
			/*
			System.out.println("�⺯ a : "+a);
			System.out.println("private b : "+b);
			*/
			/*
			  a�� b ���� ������ ���� ����....
			  static ���� Ŭ������ ��� �� �̻��� ����Ŭ������ �ƴϴ�.
			  ���� �ܺ�Ŭ���� ������ �ʰ� ������ �� �ִ�.
			  ���� top level class ��� �Ͽ� �ֻ��� Ŭ������ �Ѵ�.
			  ��¿ �� ���� ���� Ŭ������ static ���� �����ؾ� �ϴ� ��찡 �ִ�.
			  �װ� �ٷ� ���� Ŭ������ ����� �� �ϳ���
			  static ����� ���� ����̴�.
			 * */
			System.out.println("static c : "+c);
			System.out.println("static d : "+d);
		}
	}

}
