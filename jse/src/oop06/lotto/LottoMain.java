package oop06.lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		System.out.println("◀◀◀로또 시작▶▶▶");
		LottoService lotto = new LottoServiceImpl();
		System.out.println("얼마치를 구입합니까?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		scanner.close();
		lotto.extractLotto(money);
		System.out.println("로또 번호 출력");
		lotto.printLotto();
	}
}
