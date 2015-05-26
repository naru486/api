package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	
	String data ="Hello Anonymous !!";
	public void print(){
		new InnerClassAnonyService() {
			@Override
			public void printData() {
				System.out.printf("익명 내부클래스 출력 : %s\n",data);
			}
		}.printData();
	}
}
