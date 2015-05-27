package api.lang.string;
/*
 * java.lang.String
 * endWith(s) : s로 끝나는 지 여부 체크
 * */

public class EndwithDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello.txt".endsWith("txt")?"txt 파일입니다.":"txt 파일이 아닙니다."
				);
	}
}
