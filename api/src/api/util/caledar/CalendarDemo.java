package api.util.caledar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * java.util.Calendar
 * */

public class CalendarDemo {
	public static void main(String[] args) {
		String[] month={"1��","2��","3��","4��","5��","6��"
				,"7��","8��","9��","10��","11��","12��"};
		
		// Calendar.getInstance() �� ����������
		// ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		// ���� ���� �ν��Ͻ��� �������� �ʵ��� �����Ϸ���
		// �������� �ڵ��Ǿ���.
		Calendar date=Calendar.getInstance();
			
		System.out.println("��¥ : "+date.get(Calendar.YEAR)+"�� "
				+(date.get(Calendar.MONTH)+1)+"��"
				+date.get(Calendar.DATE)+"��");
		// API ���� Calendar is January which is 0 �Ǿ� �����Ƿ�,
		// �Ʒ� ��ó�� ���� ���� ���� 1�� ���ؾ� �Ѵ�.
		// ���� 1�� ������ ������ ���� ���� 5���̸� 4���� ��µȴ�.
		
		System.out.println("�ð� : "+date.get(Calendar.HOUR)+"�� "
				+date.get(Calendar.MINUTE)+"�� "
				+date.get(Calendar.SECOND)+"��");
		System.out.println("======= 1�� �� =======");
		date.add(Calendar.DATE,1);	// ���� ��¥�� 1�� ���� ���
		System.out.println(toString(date));

		/*
		 * ��µ� ��� �� : java.util.GregorianCalendar �� ��µǹǷ�,
		 * �������̵��� �ʿ��ϴ�.
		 * */

		System.out.println("======= 7�� �� =======");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		
		System.out.println("======= 1�� �� =======");
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("Ư�� �ð����� ����");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 45);
		
		System.out.println("������ �ð� ���");
		System.out.println(Calendar.HOUR+"�� ");
		System.out.println(Calendar.MINUTE+"�� ");
		System.out.println(Calendar.SECOND+"��");
		
		/*
		 * ������  �ð� ��� ��� ���� 101213 ó�� �Ǿ� �������̵��� �ʿ��ϴ�.
		 * */
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"�� "
				+(date.get(Calendar.MONTH)+1)+"�� "
				+date.get(Calendar.DATE)+"��";
	}
	/*
	public static Calendar getNowMonth(Calendar date){
	//	return date.add(Calendar.MONTH,1);
	}*/
}
