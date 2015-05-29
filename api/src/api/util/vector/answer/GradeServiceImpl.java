package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
/*
		   �޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̴�)�� �ʿ��ѵ�,
	 	   �� ������ ������ �÷����� �ʵ忡 �����ؾ߰ڴ�.
	 	   �ʵ忡 �����ؾ� �޼ҵ���� ���� ������ �� �����ϱ�....
 * */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	GradeVO grade=new GradeVO();
/*
	�� input() // �л����� ������ �Է� �޴� ���ΰ�... �׷� �Է� �޾Ƽ�
     ������ ������ �ʿ��ϰڴµ�...�迭�� ���� ������
     �����ϴ� �����ε� �� �� �����ϸ� �߰��� �ø� �� ������,
     �������� Ȯ���ϴ� �÷����� �����ؾ߰ڱ�...
     �׷��� ���� ���� �ƴ� �� ���� ���̴� ���Ϳ� �־����
     */
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	}
/*
 	�� print() // ��� �ϴ� ���ΰ�? �׷� vo ��ü�� toString() �����;���.
 * */
	@Override
	public void print() {
		System.out.println(vc.toString());
	}
/*
	�� searchGradeByHak() 
	 	   		// �й����� ������ ��ȸ�ϴ� ����̱�
	 	   		// �й��� ���� �� �л����Ը� �����ϹǷ�
	 	   		// ���ϰ��� String ���״� ������ for loop + ���ο� if �� �غ��߰ڴ�.
 * */
	@Override
	public String searchGradeByHak(String hak) {
		/*
		 * for �� �ȿ� ���� ������ �����ߴ���..
		 * ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
		 * ���� for �� ������ ���������� �ؾ߰ڴ�.
		 * */
		String msg=""; // �������� �ʱ�ȭ
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak �� ���Ϳ��� i��° ����� �й���
			 * �����Ͽ� ���� ����...Ÿ���� String
			 * */
			String myHak = vc.elementAt(i).getHak();
			/*
			 * �Ķ���ͷ� �޾� �� hak�� ���Ϳ� ��� �ִ�
			 * myHak�� ��ġ�ϴ� �� üũ�ϴ� ����
			 * */
			if (hak.equalsIgnoreCase(myHak)) {
				msg=myHak;
				break;
			}else{
				msg="��ȸ�ϴ� �й��� �����ϴ�.";
				//break;
			}
		}
		return msg;
	}
/*
	�� searchGradeByName()
	 	        // �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ����
	 	        // �������� String �� ó���ϰԲ� ����Ǿ���.
	 	        // ���ϰ��� �ϳ��̵� �������̵� for loop+if �����ۿ��� 
	 	        // ���� ��� ��·����� ������ �۰� ��� �ڴ�.
 * */
	@Override
	public Vector<String> searchGradeByName(String name) {
		/*
		 * for �� �ȿ� ���� ������ �����ߴ���..
		 * ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
		 * ���� for �� ������ ���������� �ؾ߰ڴ�.
		 * */
		Vector<String> local=new Vector<String>(); // �������� �ʱ�ȭ
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak �� ���Ϳ��� i��° ����� �й���
			 * �����Ͽ� ���� ����...Ÿ���� String
			 * */
			String myName = vc.elementAt(i).getName();
			/*
			 * �Ķ���ͷ� �޾� �� name�� ���Ϳ� ��� �ִ�
			 * myName�� ��ġ�ϴ� �� üũ�ϴ� ����
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
 	�� descGradeTotal()
	 	     	// ���������ΰ�����
	 	     	// Collections.sort ���� �ȴٴµ� ���� �� �� ó������.
 * */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
/*
 	�� ascGradeTotal()
	 	   		// ���������̸� Arrays.sort �� ���� �ǰڱ�.
 * */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
