package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo_VO {

	Scanner scanner;
	int result;
	private int[] array;

	public int vo(int[] arr) {
		/*
		 * // int[] arr={1,2,3,4,5}; int[] arr = new int[5]; int result = 0; for
		 * (int i = 0; i < arr.length; i++) { arr[i] = i + 1; result += arr[i];
		 * } // 1���� 5������ ���� ���Ͻÿ�
		 */
		result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	public void input() {
		scanner = new Scanner(System.in);
		System.out.print("���� 5���� �Է��ϼ��� : ");
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		scanner.close();
		this.setArray(intArray);
		this.vo(getArray());
	}

	public void display() {
		System.out.println("5�� ���� ���� : " + result);
	}

	public void run() {
		this.input();
		this.display();
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
}
