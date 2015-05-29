package api.util.vector.answer;
import java.util.Vector;

public interface GradeService {
	/*
	 * vo 객체 벡터에 저장하는 기능
	 * */
	public void input(GradeVO vo);
	public void print();
	/*
	 * 학번을 이용해서 성적표를 출력함(complete)
	 * */
	public String searchGradeByHak(String hak);
	/*
	 * 이름 이용한 성적 출력
	 * 동명이인 케이스까지 커버하기 위해
	 * 리턴값을 위한 벡터로 받아야 함.
	 * */
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}

/*
 1. VO, Interface 클래스다이어그램
 2. VO getter,setter ..implement
 3. 기능 중에 Total 을 구하는 기능이 필요한데..
    Total 을 구하기 위해서는
    과목 점수 역시 필요하고, 접근이
    VO 에서 더 편하므로...
    총점 구하는 기능과
    toString() 기능은 VO에서 구현하겠다.
  4. 일단 VO 는 완성했다고 보고 Holding
  5. * impl() 을 보니... 메소드를 분석해 보았다.
     대충 맘에 드는데로....
  	①input()
  	②print()
  	③searchGradeByHak()
  	④searchGradeByName()
  	⑤descGradeTotal()
  	⑥ascGradeTotal()
  	⑦대충 기능을 구현해서 시제품(프로토타입)을 만든다.
  	※ 이 때, 테스트 값을 쓰레기 값이라는 의미의 "더미 값"이라 한다.
 * */
