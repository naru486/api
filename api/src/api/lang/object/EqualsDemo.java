package api.lang.object;
/*
 * java.lang.Object 의 메소드
 * equals() : 값이 같은 지 여부를 체크한다.
 * 인스턴스 변수의 해시코드 값(힙주소값) 을 비교하는 메소드
 * */
public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1=new Temp(10);
		Temp t2=new Temp(10);
		String result="";
		// result 가 로컬변수이기 때문에
		// 반드시 초기화를 해야 한다.
		/*
		if (t1.equals(t2)) {
			System.out.println("t1 과 t2의 값이 같다. ");
		} else{
			System.out.println("t1 과 t2의 값이 다르다. ");
		}*/
		/*
		 * 삼항연산자는 if-else 문법을 대체하는 구문이다.
		 * 구성은 
		 * 조건식?true일 경우:false일 경우;
		 * */
		
		result=t1.equals(t2)?"t1 과 t2의 값이 같다. ":"t1 과 t2의 값이 다르다. ";
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : "+result);	
		
		t2= t1;
		
		result=t1.equals(t2)?"t1 과 t2의 값이 같다. ":"t1 과 t2의 값이 다르다. ";
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : "+result);	
	}
}

class Temp{
	int num; //필드에 있는 인스턴스 변수는 초기화가 필요없다.
	public Temp(int num) {
		this.num=num;
		/*
		 * 상기 형태는 heap에 저장 된 인스턴스 변수에 
		 * call stack 에 있는 num 지역 변수에 할당 된 값을
		 * 인스턴스 변수에 넘겨주고, 로컬(지역)변수 자신은 
		 * 사라지는 시나리오로 진행된다.
		 * */
	}
}
