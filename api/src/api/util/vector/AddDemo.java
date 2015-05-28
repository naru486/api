package api.util.vector;

import java.util.Vector;
/*
 java.util.Vector 의 메소드인
 add() 는 벡터에 값을 할당하는 기능을 한다.
 * */

public class AddDemo {
	public static void main(String[] args) {
		String id="admin";
		int age=27; // 나이
		Boolean male=true; //성별
		
		Vector<String> vec = new Vector<String>();
		String tom=new String("male");
		Boolean gender=new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("리터럴 문자로 생성된 객체");
		//vec.add(2); // int 형은 에러가 발생 → Generic 위배(형안정성)
		
		/* 벡터는 length()를 사용하지 않고
		 * size() 를 요소의 숫자를 표현하는데 사용
		*/
		
		// 배열에서 for loop 출력시 get(arr[i]) 하지만
		// 벡터는 elementAt(i) !!!!
		for (int i = 0; i < vec.size(); i++) {
			System.out.println("벡터의 "+(i+1)+"번째 요소는 "+vec.elementAt(i));
		}
		/*
		 * 벡터의 1번째 요소는 admin
		   벡터의 2번째 요소는 23		→ 숫자처럼 보이지만 사실은 String 리터럴
		   벡터의 3번째 요소는 false	→ boolean 타입이 아니라 String 임
		   벡터의 4번째 요소는 리터럴 문자로 생성된 객체 → 리터럴 객체도 사용 가능
		 * */
	}
}
