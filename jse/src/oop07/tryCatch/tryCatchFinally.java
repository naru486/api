package oop07.tryCatch;
/*
 ...finally..
 ���� �߻� ���ο� �������
 �ݵ�� ����Ǵ� ����
 * */

public class tryCatchFinally {
	public static void main(String[] args) {
	//	try {} catch (Exception e) {} finally{}
		try {
			System.out.println("�޼ҵ� ���� ��...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("finally ���� ��...");
		}
	}
}
