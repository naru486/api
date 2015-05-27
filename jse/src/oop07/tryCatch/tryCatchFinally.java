package oop07.tryCatch;
/*
 ...finally..
 예외 발생 여부와 상관없이
 반드시 실행되는 구분
 * */

public class tryCatchFinally {
	public static void main(String[] args) {
	//	try {} catch (Exception e) {} finally{}
		try {
			System.out.println("메소드 실행 중...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("finally 실행 중...");
		}
	}
}
