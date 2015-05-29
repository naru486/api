package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
/*
		   메소드마다 공유하는 다수의 값(학생이 여러명이니)이 필요한데,
	 	   한 군데에 저장할 컬렉션을 필드에 선언해야겠다.
	 	   필드에 선언해야 메소들들이 같은 공유할 수 있으니까....
 * */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	GradeVO grade=new GradeVO();
/*
	① input() // 학생별로 성적을 입력 받는 것인가... 그럼 입력 받아서
     저장할 공간이 필요하겠는데...배열이 다중 변수를
     저장하는 공간인데 한 번 생성하면 추가로 늘릴 수 없으니,
     동적으로 확장하는 컬렉션을 선택해야겠군...
     그런데 내가 지금 아는 건 벡터 뿐이니 벡터에 넣어야지
     */
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	}
/*
 	② print() // 출력 하는 것인가? 그럼 vo 객체의 toString() 가져와야지.
 * */
	@Override
	public void print() {
		System.out.println(vc.toString());
	}
/*
	③ searchGradeByHak() 
	 	   		// 학번으로 성적을 조회하는 기능이군
	 	   		// 학번은 오직 한 학생에게만 존재하므로
	 	   		// 리턴값이 String 일테니 벡터의 for loop + 내부에 if 를 해봐야겠다.
 * */
	@Override
	public String searchGradeByHak(String hak) {
		/*
		 * for 문 안에 지역 변수를 선언했더니..
		 * 리턴되는 위치와 영역이 달라서 에러가 났다.
		 * 따라서 for 문 밖으로 지역변수를 해야겠다.
		 * */
		String msg=""; // 지역변수 초기화
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak 은 벡터에서 i번째 요소의 학번을
			 * 리턴하여 담은 변수...타입은 String
			 * */
			String myHak = vc.elementAt(i).getHak();
			/*
			 * 파라미터로 받아 온 hak과 벡터에 담겨 있는
			 * myHak이 일치하는 지 체크하는 로직
			 * */
			if (hak.equalsIgnoreCase(myHak)) {
				msg=myHak;
				break;
			}else{
				msg="조회하는 학번이 없습니다.";
				//break;
			}
		}
		return msg;
	}
/*
	④ searchGradeByName()
	 	        // 이름으로 성적조회인데 리턴값이 벡터인 것을 보니
	 	        // 복수계의 String 을 처리하게끔 설계되었군.
	 	        // 리턴값이 하나이든 여러개이든 for loop+if 구성밖에는 
	 	        // 벡터 요소 출력로직이 없으니 글거 써야 겠다.
 * */
	@Override
	public Vector<String> searchGradeByName(String name) {
		/*
		 * for 문 안에 지역 변수를 선언했더니..
		 * 리턴되는 위치와 영역이 달라서 에러가 났다.
		 * 따라서 for 문 밖으로 지역변수를 해야겠다.
		 * */
		Vector<String> local=new Vector<String>(); // 지역변수 초기화
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak 은 벡터에서 i번째 요소의 학번을
			 * 리턴하여 담은 변수...타입은 String
			 * */
			String myName = vc.elementAt(i).getName();
			/*
			 * 파라미터로 받아 온 name과 벡터에 담겨 있는
			 * myName이 일치하는 지 체크하는 로직
			 * */
			if (name.equalsIgnoreCase(myName)) {
				local.add(name);
			}else{
				local.add("");
			}
		}
		return local;
	}
/*
 	⑤ descGradeTotal()
	 	     	// 내림차순인가보다
	 	     	// Collections.sort 쓰면 된다는데 배우면 그 때 처리하자.
 * */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
/*
 	⑥ ascGradeTotal()
	 	   		// 오름차순이면 Arrays.sort 를 쓰면 되겠군.
 * */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
