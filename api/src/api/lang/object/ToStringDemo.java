package api.lang.object;

/*import java.lang.Object;
  선언하지 않아도 Default로 import 되었음....
*/
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1=new Card("spade",7);
		Card card2=new Card("heart",2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		/*
		 * java.lang.Object 의 toString() 은 해시코드(객체 주소값)을
		 * 리턴하므로, toString() 을 오버라이딩 해서
		 * 원하는 결과를 얻도록 한다.
		 * */
	}
}
// 단, java 파일에 두 개 이상의 클래스가 있어도 되나...
// 반드시 public은 단 하나여야 한다.
class Card{
	String kind;
	int number;
	public Card() {
		this("",0);
	}
	/*
	 * 생성자 오버로딩을 쉽게 하는 방법.
	 * Default 생성자를 CTRL+Space 로 생성시킨 후
	 * 생성자 호출 예약어인 this(파라미터 갯수와 타입을 코딩);
	 * 하면 자동 생성된다.
	 * 또한, Default 생성자를 호출하더라도
	 * 파라미터가 있는 생성자까지 호출되므로,
	 * 생성자 파라미터 내용까지 알 필요없이 코딩이 간편해 진다.
	 * */
	public Card(String kind, int number) {
		this.kind=kind;
		this.number=number;
	}
	// getter, setter 는 필요시만 만들면 됨.....
	// Ctrl + Space 에서 toString()을 만들면 하드코딩량이 늘어난다.
	// Alt+Shift+s 를 한 후 generate toString 을 선택해서 생성한다.

	@Override
	public String toString() {
		return "Card [무늬=" + kind + ", 숫자=" + number + "]";
	}
	
}
