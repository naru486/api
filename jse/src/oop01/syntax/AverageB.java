package oop01.syntax;

public class AverageB  {
	
	String name;
	int kor,eng;
	
	/*�޼ҵ带 ���⿡ �����ϼż�
	 * �޼ҵ��� ��üȭ�� ���ּ���
	 */

	public int tot(){
		int result=kor+eng;
		return result;
	}
	
	public double avg(){
		double result=tot()/2d;
		return result;
	}
	
	public static void main(String[] args) {
		AverageB averageB=new AverageB();
		averageB.name="��ũ";
		averageB.kor=100;	
		averageB.eng=83;	
		System.out.println("==="+averageB.name+"�� ����ǥ===");
		System.out.println("���� : "+averageB.kor+"��");
		System.out.println("���� : "+averageB.eng+"��");
		System.out.println("���� : "+averageB.tot()+"��");
		System.out.println("��� : "+averageB.avg()+"��");
	}
}
