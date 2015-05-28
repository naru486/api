package api.util.caledar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * java.util.Calendar
 * */

public class CalendarDemo {
	public static void main(String[] args) {
		String[] month={"1월","2월","3월","4월","5월","6월"
				,"7월","8월","9월","10월","11월","12월"};
		
		// Calendar.getInstance() 는 내부적으로
		// 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		// 여러 개의 인스턴스를 생성하지 않도록 방지하려는
		// 목적에서 코딩되었다.
		Calendar date=Calendar.getInstance();
			
		System.out.println("날짜 : "+date.get(Calendar.YEAR)+"년 "
				+(date.get(Calendar.MONTH)+1)+"월"
				+date.get(Calendar.DATE)+"일");
		// API 에는 Calendar is January which is 0 되어 있으므로,
		// 아래 식처럼 월을 구할 때만 1을 더해야 한다.
		// 만약 1을 더하지 않으면 현재 월이 5월이면 4월로 출력된다.
		
		System.out.println("시간 : "+date.get(Calendar.HOUR)+"시 "
				+date.get(Calendar.MINUTE)+"분 "
				+date.get(Calendar.SECOND)+"초");
		System.out.println("======= 1일 후 =======");
		date.add(Calendar.DATE,1);	// 현재 날짜에 1을 더한 모습
		System.out.println(toString(date));

		/*
		 * 출력된 결과 값 : java.util.GregorianCalendar 이 출력되므로,
		 * 오버라이딩이 필요하다.
		 * */

		System.out.println("======= 7일 전 =======");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		
		System.out.println("======= 1달 후 =======");
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("특정 시간으로 셋팅");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 45);
		
		System.out.println("수정된 시간 출력");
		System.out.println(Calendar.HOUR+"시 ");
		System.out.println(Calendar.MINUTE+"분 ");
		System.out.println(Calendar.SECOND+"초");
		
		/*
		 * 수정된  시간 출력 결과 값이 101213 처럼 되어 오버라이딩이 필요하다.
		 * */
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"년 "
				+(date.get(Calendar.MONTH)+1)+"월 "
				+date.get(Calendar.DATE)+"일";
	}
	/*
	public static Calendar getNowMonth(Calendar date){
	//	return date.add(Calendar.MONTH,1);
	}*/
}
