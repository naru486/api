package oop01.syntax;

/*
 static 변수
 - 정적 변수
 - 클래스가 JVM 상으로 로딩시에 메모리 할당을 한다.
 - 객체의 해시코드는 JVM 의 해시알고리즘에 의해 패키지명과
 클래스 명이 조합되어 해시코드가 산출된다.
 - String 은 객체변수의 값이 같을 경우 즉 같은 문자열을
 가지고 있으며, 해시코드를 공유한다.
 String str1 = "헐크";
 String str2 = "헐크";
 str1.hashCode() == str2.hashCode(); 
 */
/*
 static 사용을 고려해야 할 사항
 - 멤변 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 붙여 사용.
 - 인스턴스 변수를 사용하지 않고, 클래스에서 바로 접근하려 할 시.
 * */

public class No06_StaticSyntax {
	String hulk1,hulk2;
	
	public static void main(String[] args) {
		String str1 = "헐크";
		String str2 = new String("헐크");
		System.out.println(str1.hashCode()==str2.hashCode()?true:false);
	}
}
