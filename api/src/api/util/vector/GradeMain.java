package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1=new GradeVO();
		vo1.setEng(80);
		vo1.setHak("1");
		vo1.setKor(70);
		vo1.setMath(45);
		vo1.setName("ȫ�浿");
		GradeVO vo2=new GradeVO();
		vo2.setEng(33);
		vo2.setHak("2");
		vo2.setKor(100);
		vo2.setMath(78);
		vo2.setName("������");
		GradeVO vo3=new GradeVO();
		vo3.setEng(44);
		vo3.setHak("3");
		vo3.setKor(71);
		vo3.setMath(45);
		vo3.setName("ȫ�浿");
		GradeService service=new GradeServiceImpl();
		service.input(vo1);
		service.input(vo2);
		service.input(vo3);
		
		System.out.println("1 ���� �й��� ���� ��ȸ"+service.searchGradeByHak("1"));
		
		// �÷��� ������ <Ŭ���� Ÿ��> �� ���׸��̶�� Ī��.
		// Ư���� ����� ���ϴ� ���� �ƴϰ� �÷��� ���ο���
		// Ÿ�� ĳ������ �Ѵٶ�� �����ϰ� �����ϼŵ� ������.
		Vector<String> vc = service.searchGradeByName("ȫ�浿");
		for (int i=0;i<vc.size();i++) {
			System.out.println(vc.elementAt(i));
		}
		
	}
}
