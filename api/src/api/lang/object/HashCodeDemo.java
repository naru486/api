package api.lang.object;
/*
해싱(Hashing)기법에 사용되는 해시함수(hash function) 을 구현한 것.
해싱은 다량의 데이터를 저장하고, 검색하는데 사용되는 데이터 관리기법.
ex) 트위터에서 해시태그를 게시글에 첨부하는 것.
	동일한 해시태그가 첨부된 게시글은 동일한 해시태그(주소값)을 참조하게
	되어 검색시 빠르게 결과값을 리턴하는 기능을 한다.
 * */

public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2="abc";
		System.out.println("abc 의 해시태그 : "+abc.hashCode());
		System.out.println("abc2 의 해시태그 : "+abc2.hashCode());
	}
}
/*[결과 출력]
 * abc 의 해시태그 : 96354
 * abc2 의 해시태그 : 96354
 
 * 결과 값은 위 처럼 나온다.
 * 결국 String 타입은 new String("abc") 처럼
 * 생성자를 통한 생성이나, "" 처럼 리터럴 형태의 생성이나
 * 동일한 주소갑을 가진다는 점을 알 수 있다.
 * 모든 객체 중, 유일하게 String 만 이 같은 특징을 가진다.
 * */
