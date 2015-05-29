package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 java.util.ArrayList 의 메소드인
 add() 는 Vector 와 동일하다.
 * */
public class AddDemo {
	   public static void main(String[] args) {
		      /*
		       벡터는 내부적으로 String 을 사용.
		       속도는 느리고 동기화를 지원한다.
		       ArrayList 는 내부적으로 StringBuffer 을 사용한다.
		       동기화 지원 안함.
		       */
		      ArrayList<String> lists = new ArrayList<String>();
		      
		      // 항목 추가
		      lists.add("서울");
		      lists.add("부산");
		      lists.add("대구");
		      
		      /*
		       출력 1 . iterator() 이용
		       */
		      /*
		       Iterator 객체를 생성하면.. 이클립스 제안에
		       3가지 선택사항이 뜬다.
		       그중에서 두번째 whith Iterator 를 선택한다.
		       */
		       Iterator<String> it1 = lists.iterator();
		       while (it1.hasNext()) {
		         //printf 를 사용합니다.
		          System.out.printf("%s",it1.next());
		          //위 예문에서 %s는 String 타입을 의미합니다.
		          // 뒤에 값은 %s 의 value 입니다.
		      }
		      System.out.println();
		      /*
		       출력 2. listIterator() 이용
		       */
		      ListIterator<String> it2 =   lists.listIterator();
		      while (it2.hasNext()) {
		         System.out.printf("%s", it2.next());
		         // 다운캐스팅이 필요없다. String 이 될 예정이다.
		      }
		      System.out.println();
		      /*
		        출력 3. previous() 이용
		       */
		      while (it2.hasPrevious()) {
		         // 메소드 명이 바뀐 부분 체크!
		         System.out.printf("%s", it2.previous());
		         // 이 메소드는 ListIterator 에서만 사용가능
		      }
		      
		      // 전체 요소를 한 번에 출력
		      // List 인터페이스는 java.util 입니다.
		      List<String> list2 = new ArrayList<String>();
		      // 인터페이스<제너릭> 참조변수 = new 구현한객체<재너릭>();
		      // 패턴입니다.
		      list2.addAll(lists); // 서울, 부산, 대구 를 복사해서 집어 넣은 상태
		      /*
		       출력 4. 확장 for문
		       콜렉션은 인덱스에 대한 조건이 굳이 주어지지 않는
		       출력형태가 많기 때문에 확장 for  문이 즐겨 사용된다.
		       */
		      for(String s: list2){
		         System.out.printf("%s",s);
		      }
		      System.out.println();
		      // 검색 명령을 위한 데이터 추가 (더미값 추가...)
		      list2.add("광주");
		      list2.add("인천");
		      list2.add("대전");
		      
		      /*
		       출력 5. 검색해서 출력
		       */
		      Iterator<String> it3 = list2.iterator();
		      String str;
		      while (it3.hasNext()) {
		         str = it3.next();
		         if(str.startsWith("대")){  // "대" 자로 시작하는 문자열 검색
		            System.out.printf("%s",str);
		         }
		         
		      }
		      System.out.println();
		      // 동일한 자료 입력 가능.. 즉 중복값을 허용함
		      list2.add("인천");
		      list2.add("인천");
		      list2.add("인천");
		      
		      Iterator<String> it4 = list2.iterator();
		      while (it4.hasNext()) {
		         System.out.printf("%s",it4.next());
		         // 참고로 printf 에서
		         // 10진수 숫자값은 %d 로 d 는 decimal 의 약자입니다.
		      }
		      System.out.println();
		   }
}
