package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		CardVO cardVO=new CardVO("heart",3);
		CardVO cardVO1=new CardVO("spade",5);
		System.out.println("ī�� ���� : "+CardVO.height);
		System.out.println("ī�� �ʺ� : "+CardVO.width);
		System.out.println("�÷��̾�� "+cardVO.getKind()+" "+cardVO.getNumber()+"�̰�, \n"
		+"��ǻ�ʹ� "+cardVO1.getKind()+" "+ cardVO1.getNumber() +" �� ��ǻ�Ͱ� �̰���ϴ�.");
		// �ν��Ͻ� �����ϼż� �Ʒ� ��� ó�� 
		// ��µǵ��� ���ּ���.
	}
}
