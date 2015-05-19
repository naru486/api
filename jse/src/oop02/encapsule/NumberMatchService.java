package oop02.encapsule;

public class NumberMatchService { // getter setter 안씀 //for문
	NumberMatchVO matchVO = new NumberMatchVO();
	int result;

	public int game(int player) {
		int result = 0;
		int count=0;
		
		matchVO.setCom();
		matchVO.setPlayer(player);
		if (matchVO.getPlayer() == matchVO.getCom()) {
			System.out.println(matchVO.getPlayer() + "정답 !!");
			result = 1;
		} else {
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 " + matchVO.getCom() + " 입니다.");
			result = 0;
		}
		return result;
	}
}
