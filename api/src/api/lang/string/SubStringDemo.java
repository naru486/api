package api.lang.string;
/*
 * java.lang.String �� �ִ�
 * substring() �޼ҵ��
 * ���� ��ġ(begin) ���� �� ��ġ(end) ���� ���ڿ� ����
 * begin <= x < end
 * */

public class SubStringDemo {
	public static void main(String[] args) {
		// �ε����� 0 ���� �����ϴ� ���鵵 1�� ó���Ѵ�. 
		System.out.println("�Ķ���� �� �� �� �� : "+"Hello Java".substring(6));
		// 6 ������ 7�� ° �ε��� J ���� 9��° �̸� �ε����� a
		// �׷��� Ja ����
		System.out.println("�Ķ���� �� �� �� �� : "+"Hello Java".substring(6,8));
	}
}
