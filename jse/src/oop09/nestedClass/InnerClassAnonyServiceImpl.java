package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	
	String data ="Hello Anonymous !!";
	public void print(){
		new InnerClassAnonyService() {
			@Override
			public void printData() {
				System.out.printf("�͸� ����Ŭ���� ��� : %s\n",data);
			}
		}.printData();
	}
}
