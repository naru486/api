package api.lang.string;
/*
 * java.lang.String
 * contain(s) : s 라는 글자가 포함되었는지 여부 체크
 * */

public class ContainDemo {
	public static void main(String[] args) {
		String str="abcde";
		/*
		 * (조건식)?true값:false값;
		 * */
		System.out.println(str.contains("f")?"f가 포함":"f가 불포함");
	}
}
