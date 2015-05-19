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
	 * 컴퓨터가 랜덤으로 발생시킨 수 1~3 까지
	 * */
	public int displayComVal() {
		return (int)(Math.random()*3)+1;
	}
	/*
	 * 승자를 보여주는 로직
	 * */
	public String showWinner(int playerVal,int comVal) {
		String winner=""; //1.가위,2.바위,3.보
		this.com=displayComVal();
	
		switch (playerVal-comVal) {
		case 0:
			winner="비겼음";
			break;
		case 1:case -2:winner="플레이어";
			break;

		default:winner="컴퓨터";
			break;
		}
		return winner;
	}
    
	// 승자에 할당된 가위, 바위, 보를 문자로 전환해서 보여주는 역할
	public String showRpsVal(int rps){
		String result="";
		rpsUtil=new RpsUtil();
		gameRpsVO=new GameRpsVO();
		switch (rps) {
		case 1:
			result="가위";
			gameRpsVO.setScissors(1);
			break;
		case 2:
			result="바위";
			gameRpsVO.setRock(2);
			break;
		case 3:
			result="보";
			gameRpsVO.setPaper(3);
			break;
		default:
			System.out.println(rpsUtil.showRange(1, 3));
			break;
		}	
		return result;
	}
}
