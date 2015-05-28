package api.lang.string;
/*
 * java.lang.String 에 있는
 * substring() 메소드는
 * 시작 위치(begin) 부터 끝 위치(end) 범위 문자열 리턴
 * begin <= x < end
 * */

public class SubStringDemo {
	public static void main(String[] args) {
		// 인덱스는 0 부터 시작하는 공백도 1로 처리한다. 
		System.out.println("파라미터 한 개 일 때 : "+"Hello Java".substring(6));
		// 6 이지만 7번 째 인덱스 J 부터 9번째 미만 인덱스인 a
		// 그래서 Ja 리턴
		System.out.println("파라미터 두 개 일 때 : "+"Hello Java".substring(6,8));
	}
}
