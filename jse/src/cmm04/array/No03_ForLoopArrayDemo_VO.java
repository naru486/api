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
		 * } // 1부터 5까지의 합을 구하시오
		 */
		result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	public void input() {
		scanner = new Scanner(System.in);
		System.out.print("숫자 5개를 입력하세요 : ");
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		scanner.close();
		this.setArray(intArray);
		this.vo(getArray());
	}

	public void display() {
		System.out.println("5개 수의 합은 : " + result);
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
