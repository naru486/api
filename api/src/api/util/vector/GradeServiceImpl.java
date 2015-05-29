package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	
	private Vector<GradeVO> grades=new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		grades.add(vo);
	}
	/*
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString() ���� ó�� �����ϰ� ����
	 * */
	@Override
	public void print() {
	
	}
	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ�
	 * */
	@Override
	public String searchGradeByHak(String hak) {
		//GradeVO vo=new GradeVO();
		// ���ʹ� size() �� limit �� ǥ����
		String result="";
		for (GradeVO vo:grades) {
			if (vo.getHak().equals(hak)) {
				result= vo.toString();
			}else{
				result="��ȸ �� �й��� �ش��ϴ� �л��� �����ϴ�.";
			}
		}
		return result;
	}
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 * */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc=new Vector<String>();
		/*
		 * ���ͳ� ��Ÿ �÷��� ����� �ϰ� �Ǹ�...
		 * Iterator �ƴϸ� Ȯ�� for ������ ó���Ѵ�.
		 * �ֳ��ϸ� Ȯ�� for ���� �ε����� ������ ����...
		 * */
		/*
		 * grades�� �� �� �ִ� ������ ����ʵ忡 �����Ͽ�
		 * ���� Ŭ���� ������ �޼ҵ���� ���� �����ϱ� ������
		 * */
		for (GradeVO vo:grades) {
			if (vo.getName().equalsIgnoreCase(name)) {
				/*
				 * �Ķ���ͷ� �Ѿ�� �̸��� ������ VO ��ü��
				 * ã�Ƽ� String ���·� ���Ϳ� �����Ѵ�.
				 * ��, vc �� String Ÿ���̶� �Ϳ� ����
				 * GradeVO Ÿ���� �ƴ�...
				 * */ 
				vc.add(vo.toString());
			}
		}
		return vc; // ���ϰ��� ���� ������ ������ ����....
	}
	/*
	 * ���� ���� �������� ������������ ���Ľ�Ű�� �޼���
	 * */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * ���� ���� �������� ������������ ���Ľ�Ű�� �޼���
	 * */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
}
