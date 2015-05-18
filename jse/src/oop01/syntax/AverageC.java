package oop01.syntax;

public class AverageC {
	int kor,eng;
	public static void main(String[] args) {
		AverageVO vo=new AverageVO();
		vo.setName("ÇæÅ©");
		vo.setEng(83);
		vo.setKor(100);
	
		System.out.println("==="+vo.getName()+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+vo.getKor()+"Á¡");
		System.out.println("¿µ¾î : "+vo.getEng()+"Á¡");
		AverageVO averageVO=new AverageVO();

		System.out.println("ÃÑÁ¡ : "+averageVO.getTot()+"Á¡");
		System.out.println("Æò±Õ : "+averageVO.getAvg()+"Á¡");

	}
}
