package oop01.syntax;

/*
 메소드에 값을 전달하는 방법
 - Call By Value
 - 메소드로 한 문자, 상수 문자열, 숫자를 전달하면 전부 값에 의한 전달이라고 한다.
 - C언어인 경우에는 숫자, 문자, 계열만 Call By Value 이고,
   문자열은 char *형 이므로 Call By Address가 된다.
 - C언어 처럼 주소(포인터) 를 전달하는 Call By Address 는
   자바에서는 없다.
 - Call By Value 의 경우 값을 전달하면 값을 전송한 원본 변수는 변형이 안 된다.
   단지, Stack 간의 값이 복사된다.
 - Call By Reference 의 경우 참조값 (Hash Code)을 전달한 객체는 자신의 
   참조값이 전달 됨으로써 값의 변화가 발생할 수 있다. 
 * */
/*
 Call By Reference 참조값에 의한 전달
 - 원본 객체의 데이터가 변경된다.
   변경을 목적으로 하는 경우 이용된다.
 * */
/*
 String 객체의 데이터 전달 유형
 - String 객체는 객체임으로 내부적으로 Call By Reference 를 사용하나
 - 문자열 할당 등의 조직시 무조건 Call By Value 기능으로 작동한다.
 - 문자열이 같으면 멤변이나 지변은 같은 Hash Code 를 가지고 있다가
 - 영영 구분이 없어진다. 그러나 새로운 문자열이 지변에 대입하면
 - 또 다른 Hash Code 가 발생되면서 멤버변수와 구분되게 된다. 
 * */

public class No08_CallByReferenceSyntax {

}
