package oop01.encapsule;

/*
 Date : 2015.05.15 
 Author : 김호영
 description : 가위, 바위, 보 게임 로직
 1 은 가위 2는 바위 3은 보
 */
public class GameRpsService {
	/*
	 숫자값에 따른 가위, 바위, 보 로직 
	 */
	public String showRpsValue(int playerValue) {
		String result="";
		switch (playerValue) {
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
			result="다시 입력하세요";
			break;
		}	
		return result;
	}

	/*
	 컴퓨터가 Random으로 발생 시킨 수 1~3 까지 
	 */
	public int displayComValue() {
		int comValue=(int)(Math.random()*3)+1;
		return comValue;
	}
	/*
	 승자를 보여주는 로직
	 */
	public String showWinner() {
		return null;
	}

}
