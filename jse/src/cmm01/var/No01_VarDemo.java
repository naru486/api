package cmm01.var;
/*
 변수의 작성 규칙
 1. 알파벳 대소문자, 숫자, _(Underscore), $ 만 사용가능
 2. 첫 문자가 숫자이면 안됨
 3. 키워드(예약어)와 같으면 안됨
 */

class No01_VarDemo {
	// 논리형, 1바이트, 초기값 : false
	boolean result = true;
	// 문자형, 2바이트, 초기값 = \u0000
	char capitalC = 'C';
	// 정수형
	byte varByte = 100; // 8비트, -128 ~ 127
	short varShort = 10000; // 16비트, 초기값 0
	int varInt = 1000000; // 32비트, 초기값 0
	long varLong = 100L; // 64비트, 초기값 0
	// 부동소숫점 타입
	float varFloat = 100.0f; // 32비트
	double varDouble = 100.00d; // 64비트
}