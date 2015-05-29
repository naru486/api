package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service=new GradeServiceImpl();
		// 일일이 setter 만들기 귀찮음
		// 생성자로 한 번에 만들기~~~
	    GradeVO g1 = new GradeVO("1111","홍길동",70,80,90);
	    GradeVO g2 = new GradeVO("2222","김길동",75,90,40);
	    GradeVO g3 = new GradeVO("3333","김길동",10,10,10);
	    service.input(g1);
	    service.input(g2);
	    service.input(g3);
	    service.print();
	    /*
	     * 성적표 [학번=, 이름=, 국어=0, 영어=0, 수학=0총점=0]
	     *  이 나온다..
	     *  결과를 보니까 grade 를 출력은 하는데, 벡터에 들어있는 녀석이
	     *  아니라 그냥 null 값
	     *  그럼 벡터에 있는 grade가 나올 수 있도록 하자. 
	     *  grade 대신에 vc.toString() 해야 겟다.
	     * */
	    String dummy = service.searchGradeByHak("1111");
	    System.out.println(dummy);
	    Vector<String> temp=new Vector<String>();
	    temp=service.searchGradeByName("김길동");
	    System.out.println(temp.toString()); 
	}
}
