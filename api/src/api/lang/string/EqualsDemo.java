package api.lang.string;
/*
 * java.lang.String
 * '==' 은 객체의 Reference value(hash code table)을 비교한 것.
 * 문자열에 대한 비교는 반드시 equals() 메소드를 이용.
 * new 를 이용하면 heap 영역에 새로운 메모리를 할당하고,
 * hashcode 를 생성한다.
 * */

public class EqualsDemo {
	public static void main(String[] args) {
		// String 값을 리터럴 생성한 경우
		String str1="abc";
		String str2="abc";
		
		String result1 = (str1==str2)?"1~2번 동일":"1~2번 다름";
		String result2 = (str1.equals(str2))?"1~2번 동일":"1~2번 다름";
		
		System.out.println("(str1==str2) 인 경우 : "+result1);
		System.out.println("(str1.equals(str2)) 인 경우 : "+result2);
		
		// String 값을 생성자로 생성한 경우
		String str3=new String("abc");
		String str4=new String("abc");
		
		String result3 = (str3==str4)?"3~4번 동일":"3~4번 다름";
		String result4 = (str3.equals(str4))?"3~4번 동일":"3~4번 다름";
		
		System.out.println("(str3==str4) 인 경우 : "+result3);
		System.out.println("(str3.equals(str4)) 인 경우 : "+result4);
		/*
		 * result3 의 결과가 다름으로 나온 이유...
		 * - String 클래스의 생성자를 이용하여 String 인스턴스를 생성한 경우에는
		 * - new 연산자에 의해 메모리 할당이 이뤄지기 때문에
		 * - 항상 새로운 String 인스턴가 생성된다.
		 * - 그래서, String 타입은 생성자로 객체를 생성하지 않고,
		 *   리터럴로 생성한다.
		 * */
		/*
		 * 모든 클래스파일(*.class) 에는 constant pool 이라는
		 * 상수들이 있어서, 클래스 내에 사용되는 모든 리터럴과
		 * 상수들이 저장되어 있다.
		 * 등록하고자 하는 문자열이 상수풀에 이미 존재하는 경우에는
		 * 그 문자열의 주소값을 반환한다.
		 * */
		 String str5=new String("abc");
		 String str6="abc";
				
		 String result5 = (str5==str6)?"3~4번 동일":"3~4번 다름";
		 String result6 = (str5.equals(str6))?"3~4번 동일":"3~4번 다름";
				
		 System.out.println("(str5==str6) 인 경우 : "+result5);
		 System.out.println("(str5.equals(str6)) 인 경우 : "+result6);
	}
}
