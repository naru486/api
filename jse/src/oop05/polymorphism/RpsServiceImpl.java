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
		   case 0 : winner = "플레이어와 컴퓨터는 비겼습니다."; break;
		   case 1 : case -2:
		      winner = "플레이어가 이겼습니다."; break;
		   default : winner = "플레이어가 졌습니다."; break;
		}
		return winner;
	}

	@Override
	public String showRpsVal(int playerVal) {
		String result="";
		switch (playerVal) {
		case 1:
			result="가위";
			break;
		case 2:
			result="바위";
			break;
		case 3:
			result="보";
			break;
		default:
			//result="다시 입력하세요";
			break;
		}	
		return result;
	}

}
