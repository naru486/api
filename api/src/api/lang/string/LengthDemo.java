package api.lang.string;
/*
 * java.lang.String
 * length() : String 문자열의 길이를 구하는 메소드
 * */

public class LengthDemo {
	public static void main(String[] args) {
		String tmp="자바 API 학습";
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
