package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	
	private Vector<GradeVO> grades=new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		grades.add(vo);
	}
	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음
	 * */
	@Override
	public void print() {
	
	}
	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 * */
	@Override
	public String searchGradeByHak(String hak) {
		//GradeVO vo=new GradeVO();
		// 벡터는 size() 로 limit 을 표시함
		String result="";
		for (GradeVO vo:grades) {
			if (vo.getHak().equals(hak)) {
				result= vo.toString();
			}else{
				result="조회 된 학번에 해당하는 학생이 없습니다.";
			}
		}
		return result;
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 * */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc=new Vector<String>();
		/*
		 * 벡터나 기타 컬렉션 출력을 하게 되면...
		 * Iterator 아니면 확장 for 무으로 처리한다.
		 * 왜냐하면 확정 for 문은 인덱스를 따지기 때문...
		 * */
		/*
		 * grades를 쓸 수 있는 이유는 멤버필드에 선언하여
		 * 같은 클래스 내부의 메소드들이 값을 공유하기 때문에
		 * */
		for (GradeVO vo:grades) {
			if (vo.getName().equalsIgnoreCase(name)) {
				/*
				 * 파라미터로 넘어온 이름과 동일한 VO 객체를
				 * 찾아서 String 형태로 벡터에 저장한다.
				 * 즉, vc 는 String 타입이란 것에 주의
				 * GradeVO 타입이 아님...
				 * */ 
				vc.add(vo.toString());
			}
		}
		return vc; // 리턴값은 성적 정보를 저장한 벡터....
	}
	/*
	 * 종합 점수 기준으로 내림차순으로 정렬시키는 메서드
	 * */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 종합 점수 기준으로 오름차순으로 정렬시키는 메서드
	 * */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
}
