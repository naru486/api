package oop09.nestedClass;
/*
 ����Ŭ������ �� ��° ����
 - Local ���� Ŭ���������� �ܺ� Ŭ������ ����� �����Ѵµ� �־
 - ������ ������, �켱 �ܺ� Ŭ������ ��������� ������ �� �ִ�.
 - ������ �޼��� ������ ���������� ������ �� ����.
 * */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m=new InnerClassMain();
		//m.getInnerClassInstance();
	    //m.getInnerClassLocal();
		//m.getInnerStaticInstance();
		m.getInnerClassAnonySeriveImpl();
	}

	public void getInnerClassAnonySeriveImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}

	public void getInnerStaticInstance() {
		InnerClassStatic.Inner inn =new InnerClassStatic.Inner(); // static 
		inn.printData();
	}

	public void getInnerClassLocal() {
		InnerClassLocal outer=new InnerClassLocal();
		outer.innerTest(1000);
	}

	// ALT + SHIFT + M �޼ҵ� ���� ����Ű
	// �����丵
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn=new InnerClassInstance().new Inner(); //���� Ŭ���� �����ڷ� ����
		inn.printData();
	}
}
