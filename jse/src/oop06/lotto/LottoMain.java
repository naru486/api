package oop06.lotto;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		System.out.println("�������ζ� ���ۢ�����");
		LottoService lotto = new LottoServiceImpl();
		System.out.println("��ġ�� �����մϱ�?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		scanner.close();
		lotto.extractLotto(money);
		System.out.println("�ζ� ��ȣ ���");
		lotto.printLotto();
	}
}
