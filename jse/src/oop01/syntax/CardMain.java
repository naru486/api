package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		CardVO cardVO=new CardVO("heart",3);
		CardVO cardVO1=new CardVO("spade",5);
		System.out.println("카드 높이 : "+CardVO.height);
		System.out.println("카드 너비 : "+CardVO.width);
		System.out.println("플레이어는 "+cardVO.getKind()+" "+cardVO.getNumber()+"이고, \n"
		+"컴퓨터는 "+cardVO1.getKind()+" "+ cardVO1.getNumber() +" 라서 컴퓨터가 이겼습니다.");
		// 인스턴스 생성하셔서 아래 결과 처럼 
		// 출력되도록 해주세요.
	}
}
