package oop09.nestedClass;

public class InnerClassLocal {
	int a=100;
	public void innerTest(int k){
		int b=200;
		final int c=k;
		class Inner{
			public void getData(){
				System.out.println("������� a : "+a);
				System.out.println("��� c : "+c);
				//System.out.println("�������� b : "+b);
			}
		}
		Inner inn=new Inner();
		inn.getData();
	}
}
