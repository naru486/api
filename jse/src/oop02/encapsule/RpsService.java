package oop02.encapsule;

public class RpsService {
	
	int player;
	int com;
	RpsUtil rpsUtil;
	GameRpsVO gameRpsVO;
	public RpsService(int playerVal) {
		player=playerVal;
	}
	/*
	 * ��ǻ�Ͱ� �������� �߻���Ų �� 1~3 ����
	 * */
	public int displayComVal() {
		return (int)(Math.random()*3)+1;
	}
	/*
	 * ���ڸ� �����ִ� ����
	 * */
	public String showWinner(int playerVal,int comVal) {
		String winner=""; //1.����,2.����,3.��
		this.com=displayComVal();
	
		switch (playerVal-comVal) {
		case 0:
			winner="�����";
			break;
		case 1:case -2:winner="�÷��̾�";
			break;

		default:winner="��ǻ��";
			break;
		}
		return winner;
	}
    
	// ���ڿ� �Ҵ�� ����, ����, ���� ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int rps){
		String result="";
		rpsUtil=new RpsUtil();
		gameRpsVO=new GameRpsVO();
		switch (rps) {
		case 1:
			result="����";
			gameRpsVO.setScissors(1);
			break;
		case 2:
			result="����";
			gameRpsVO.setRock(2);
			break;
		case 3:
			result="��";
			gameRpsVO.setPaper(3);
			break;
		default:
			System.out.println(rpsUtil.showRange(1, 3));
			break;
		}	
		return result;
	}
}
