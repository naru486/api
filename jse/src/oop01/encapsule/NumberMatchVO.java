package oop01.encapsule;

public class NumberMatchVO { // getter setter toString만
	private int player, com, count;

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		
		if (player < 1 || player > 3) {
			System.out.println("1 부터 3까지의 정수만 입력해야 합니다.");
		} else {
			this.player = player;
		}
	}

	public int getCom() {
		return com;
	}

	public void setCom() {
		this.com = (int) ((Math.random() * 3) + 1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
