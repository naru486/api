package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	
	public static void main(String[] args) {
		// tot, avg ���������� �����Ͻð�
		// �Ʒ��� ���� ��µǵ��� ���ּ���.
		AverageA averageA=new AverageA();
		int tot=0;
		double avg=0;
		
		averageA.name="��ũ";
		averageA.kor=100;	
		averageA.eng=82;	
		System.out.println("==="+averageA.name+"�� ����ǥ===");
		System.out.println("���� : "+averageA.kor+"��");
		System.out.println("���� : "+averageA.eng+"��");
		tot=averageA.kor+averageA.eng;
		avg=tot/2.0;
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
		System.out.println("==="+averageA.name+"�� ����ǥ===");
		averageA.name="���̾��";
		averageA.kor=94;	
		averageA.eng=45;	
		System.out.println("���� : "+averageA.kor+"��");
		System.out.println("���� : "+averageA.eng+"��");
		tot=averageA.kor+averageA.eng;
		avg=(double)tot/2;
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
		System.out.println("==="+averageA.name+"�� ����ǥ===");
		averageA.name="�丣";
		averageA.kor=44;	
		averageA.eng=25;	
		System.out.println("���� : "+averageA.kor+"��");
		System.out.println("���� : "+averageA.eng+"��");
		tot=averageA.kor+averageA.eng;
		avg=tot/2d;
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		System.out.println();
	}
}
