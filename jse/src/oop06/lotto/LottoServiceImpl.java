package oop06.lotto;

public class LottoServiceImpl implements LottoService {
	private int money;
	int[][] lottos;
	int[][] arr;
	int[] tempArr;

	@Override
	public void extractLotto(int money) { //isDuplication() �缳�� �ؾ� ��
		inputMoney(money);
		int count = this.getCount(money);
		tempArr = new int[6];
		
		for (count = 0; count < lottos.length; count++) {
			for (int i = 0; i < 6; i++) {
				tempArr[i] = getRandomNum(); // 6���� �Ѱ��� �ߺ� �Ǵ� ����
												// Ȯ������ �ʴٴ� ����
												// ���� �ֱ� ���ؼ� 6����
												// ����
				// �� ����
				for (int j = 0; j < i; j++) {
					if (tempArr[j] == tempArr[i]) {
						tempArr[i] = getRandomNum();
						j = -1; // �������� �Ӽ��� j++ �� �ǹǷ� 0 ���� �ϸ� 0��°�� �񱳸� ���Ѵ�.�׷��� -1��
								// �ؾ��� 0�� ���� �� �Ѵ�.
					}
				}
			}
			for (int j = 0; j < lottos[count].length; j++) {
				lottos[count][j] = tempArr[j];
			}
		}
		
		
		for (int i = 0; i < 6; i++) {
			tempArr[i] = getRandomNum(); // 6���� �Ѱ��� �ߺ� �Ǵ� ����
											// Ȯ������ �ʴٴ� ����
											// ���� �ֱ� ���ؼ� 6����
											// ����
			// �� ����
			for (int j = 0; j < i; j++) {
				if (tempArr[j] == tempArr[i]) {
					tempArr[i] = getRandomNum();
					j = -1; // �������� �Ӽ��� k++ �� �ǹǷ� 0 ���� �ϸ� 0��°�� �񱳸� ���Ѵ�.�׷��� -1��
							// �ؾ��� 0�� ���� �� �Ѵ�.
				}
			}
		}
	}

	@Override
	public void printLotto() {
		for (int i = 0; i < lottos.length; i++) { // ���� �ϱ��� 2���� �迭 ���� 1���� �迭��
													// �����ϱ�
			for (int j = 0; j < lottos[i].length; j++) {
				tempArr[j] = lottos[i][j];
			}
			for (int j = 0; j < lottos[i].length; j++) {
				sort(tempArr); // �������� ����
				lottos[i][j] = tempArr[j];
				System.out.print(lottos[i][j] + "\t");
			}
			System.out.println(); // �ζ� �� ���� ����
		}
		System.out.println(); // ���� ����
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int[money / 1000][6];
	}

	@Override
	public int getRandomNum() {
		return (int) ((Math.random() * 45) + 1);
	}

	@Override
	public boolean isDuplication() {
		return true;
	}

	@Override
	public void sort(int[] array) {
		// int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// �ϼ��� �ּ���
					// ���п�
					// ���� �˰��� �˻��ϸ�
					// �� ���ɴϴ�.
					/*
					 * temp=array[j]; array[j]=array[j+1]; array[j+1]=temp;
					 */
					array[j] ^= array[j + 1];
					array[j + 1] ^= array[j];
					array[j] ^= array[j + 1];
				}
			}
		}
		tempArr = array;
	}

	/*
	 * �ݾ��� ������ �� �� �� extractLottos() �� �������ΰ�? �ܵ� �� ���� ��� 7000���̸� 7ȸ ȸ�� �ϰԲ� ī��Ʈ
	 * ���ڸ� �����ϴ� ����
	 */
	@Override
	public int getCount(int money) {
		if (money < 1000) {
			return 0;
		}
		return (int) Math.ceil(money / 1000);
	}
}
