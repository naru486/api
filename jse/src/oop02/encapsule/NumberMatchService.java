package oop02.encapsule;

public class NumberMatchService { // getter setter �Ⱦ� //for��
	NumberMatchVO matchVO = new NumberMatchVO();
	int result;

	public int game(int player) {
		int result = 0;
		int count=0;
		
		matchVO.setCom();
		matchVO.setPlayer(player);
		if (matchVO.getPlayer() == matchVO.getCom()) {
			System.out.println(matchVO.getPlayer() + "���� !!");
			result = 1;
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� " + matchVO.getCom() + " �Դϴ�.");
			result = 0;
		}
		return result;
	}
}
