package oop01.encapsule;

/*
 Date : 2015.05.15 
 Author : ��ȣ��
 description : ����, ����, �� ���� ����
 1 �� ���� 2�� ���� 3�� ��
 */
public class GameRpsService {
	/*
	 ���ڰ��� ���� ����, ����, �� ���� 
	 */
	public String showRpsValue(int playerValue) {
		String result="";
		switch (playerValue) {
		case 1:
			result="����";
			break;
		case 2:
			result="����";
			break;
		case 3:
			result="��";
			break;
		default:
			result="�ٽ� �Է��ϼ���";
			break;
		}	
		return result;
	}

	/*
	 ��ǻ�Ͱ� Random���� �߻� ��Ų �� 1~3 ���� 
	 */
	public int displayComValue() {
		int comValue=(int)(Math.random()*3)+1;
		return comValue;
	}
	/*
	 ���ڸ� �����ִ� ����
	 */
	public String showWinner() {
		return null;
	}

}
