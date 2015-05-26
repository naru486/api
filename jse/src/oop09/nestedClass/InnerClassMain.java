package oop09.nestedClass;
/*
 내부클래스의 두 번째 형태
 - Local 내부 클래스에서는 외부 클래스의 멤버를 접근한는데 있어서
 - 제한이 따른다, 우선 외부 클래스의 멤버변수는 접근할 수 있다.
 - 하지만 메서드 내부의 지역변수는 접근할 수 없다.
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

	// ALT + SHIFT + M 메소드 독립 단축키
	// 리팩토링
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn=new InnerClassInstance().new Inner(); //내부 클래스 생성자로 접근
		inn.printData();
	}
}
