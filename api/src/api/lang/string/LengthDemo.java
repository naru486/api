package api.lang.string;
/*
 * java.lang.String
 * length() : String ���ڿ��� ���̸� ���ϴ� �޼ҵ�
 * */

public class LengthDemo {
	public static void main(String[] args) {
		String tmp="�ڹ� API �н�";
		int len =tmp.length();
		char[] tmCharArr = new char[len];
		char[] charArr = new char[len];
		
		for (int i = 0; i < len; i++) {
			tmCharArr[i]=tmp.charAt(i);
		}
		// reverse
		for (int i = 0; i < len; i++) {
			charArr[i] = tmCharArr[len-1-i];
		}
		String reversTmp=new String(charArr);
		System.out.println(reversTmp);
	}
}
