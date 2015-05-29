package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1=new GradeVO();
		vo1.setEng(80);
		vo1.setHak("1");
		vo1.setKor(70);
		vo1.setMath(45);
		vo1.setName("홍길동");
		GradeVO vo2=new GradeVO();
		vo2.setEng(33);
		vo2.setHak("2");
		vo2.setKor(100);
		vo2.setMath(78);
		vo2.setName("강감찬");
		GradeVO vo3=new GradeVO();
		vo3.setEng(44);
		vo3.setHak("3");
		vo3.setKor(71);
		vo3.setMath(45);
		vo3.setName("홍길동");
		GradeService service=new GradeServiceImpl();
		service.input(vo1);
		service.input(vo2);
		service.input(vo3);
		
		System.out.println("1 번의 학번의 성적 조회"+service.searchGradeByHak("1"));
		
		// 컬렉션 내부의 <클래스 타입> 을 제네릭이라고 칭함.
		// 특별한 기능을 말하는 것은 아니고 컬렉션 내부에서
		// 타입 캐스팅을 한다라고 간단하게 정리하셔도 무방함.
		Vector<String> vc = service.searchGradeByName("홍길동");
		for (int i=0;i<vc.size();i++) {
			System.out.println(vc.elementAt(i));
		}
		
	}
}
