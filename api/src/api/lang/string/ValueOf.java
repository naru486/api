package api.lang.string;
/*
 * java.lang.String 의 메소드 중
 * toUpperCase() 는 해당 문자열을 대문자로 변환
 * toLowerCase() 는 해당 문자열을 소문자로 변환
 * valueOf() 는 다른 타입을 모두 문자열로 변환
 * */

public class ValueOf {
	public static void main(String[] args) {
		String str="Hello Java";
		System.out.println("테스트용 문장 : "+str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("Str의 길이 : "+str.length());
		// 예제의 valueOf() 의 파라미터 값은 int 형이다.
		// Integer.parseInt() 를 하지 않고도,
		// String 클래스의 static 메소드인 valueOf()
		// 를 호출하면 바로 문자열로 변환된다.
	
		System.out.println("valueOf 의 결과 : "+String.valueOf(str.length()));
	}
}
