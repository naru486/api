package oop01.syntax;

public class AverageC {
	int kor,eng;
	public static void main(String[] args) {
		AverageVO vo=new AverageVO();
		vo.setName("��ũ");
		vo.setEng(83);
		vo.setKor(100);
	
		System.out.println("==="+vo.getName()+"�� ����ǥ===");
		System.out.println("���� : "+vo.getKor()+"��");
		System.out.println("���� : "+vo.getEng()+"��");
		AverageVO averageVO=new AverageVO();

		System.out.println("���� : "+averageVO.getTot()+"��");
		System.out.println("��� : "+averageVO.getAvg()+"��");

	}
}
