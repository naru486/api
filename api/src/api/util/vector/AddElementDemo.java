package api.util.vector;

import java.util.Vector;
/*
 java.util.Vector �� �޼ҵ���
 addElement() �� �⺻������ add() �� �����ϴ�.
 * */

public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros={"iron","thor","hulk","hawkeye"};
		Vector<String> avengers=new Vector<String>();
		// ���Ϳ� �迭�� ��Ҹ� addElement()
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
		}
		// �丣�� �����ϴ� �� üũ constraint() �� ����Ѵ�.
		String thor="thor";
		if (avengers.contains(thor)) {
			int idx=avengers.indexOf(thor);
			System.out.println("�丣�� "+idx+"��°�� �ֽ��ϴ�.");
		}else{
			System.out.println("�丣�� �����ϴ�.");
		}
		/*
		 * ù ��° ���(���) ���� avengers.removeElementAt(0) �� �����.
		 * ������ �ε����� 0���� �����Ѵ�. 0�� �� ù ��° �����.
		 * */
		avengers.removeElementAt(0);
		System.out.println("���� �� ��� ��ġ �ε��� ��ȭ");
		for (int i = 0; i < avengers.size(); i++) {
			System.out.println("Avengers �� "+(i+1)+"��° : "+avengers.elementAt(i));
		}
	}
}