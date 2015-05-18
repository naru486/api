package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor,eng;
	
	// getter setter ������� ���� 
	// �����ڷ� ó��
	// ��, avg(), tot()�� �ۼ�
	
	public AverageEVO(){} // default ������ ���� �ۼ�
	
	public AverageEVO(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	private double avg(){
		return total()/2d;
	}
	
	private int total(){
		return kor+eng;
	}
	
	private String name(){
		return name;
	}
	
	@Override
	public String toString(){
		return "=== "+name()+"�� ����ǥ ===\n"
					+"���� : "+kor+" ��\n"
					+"���� : "+eng+" ��\n"
					+"���� : "+total()+" ��\n"
					+"��� : "+avg()+ "��\n";
	}
}
