package api.lang.string;
/*
 * java.lang.String �� �޼ҵ� ��
 * toUpperCase() �� �ش� ���ڿ��� �빮�ڷ� ��ȯ
 * toLowerCase() �� �ش� ���ڿ��� �ҹ��ڷ� ��ȯ
 * valueOf() �� �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ
 * */

public class ValueOf {
	public static void main(String[] args) {
		String str="Hello Java";
		System.out.println("�׽�Ʈ�� ���� : "+str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("Str�� ���� : "+str.length());
		// ������ valueOf() �� �Ķ���� ���� int ���̴�.
		// Integer.parseInt() �� ���� �ʰ�,
		// String Ŭ������ static �޼ҵ��� valueOf()
		// �� ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ�ȴ�.
	
		System.out.println("valueOf �� ��� : "+String.valueOf(str.length()));
	}
}
