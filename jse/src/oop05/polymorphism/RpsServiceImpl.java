package oop05.polymorphism;

public class RpsServiceImpl implements RpsService {

	@Override
	public int displayComVal() {
		int comValue=(int)(Math.random()*3)+1;
		return comValue;
	}

	@Override
	public String showWinner(int playerVal, int comVal) {
		String winner="";
		switch (playerVal-comVal) {
		   case 0 : winner = "�÷��̾�� ��ǻ�ʹ� �����ϴ�."; break;
		   case 1 : case -2:
		      winner = "�÷��̾ �̰���ϴ�."; break;
		   default : winner = "�÷��̾ �����ϴ�."; break;
		}
		return winner;
	}

	@Override
	public String showRpsVal(int playerVal) {
		String result="";
		switch (playerVal) {
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
			//result="�ٽ� �Է��ϼ���";
			break;
		}	
		return result;
	}

}
