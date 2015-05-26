package oop06.lotto;

public class LottoServiceImpl implements LottoService {
	private int money;
	int[][] lottos;
	int[][] arr;
	int[] tempArr;

	@Override
	public void extractLotto(int money) { //isDuplication() 재설계 해야 함
		inputMoney(money);
		int count = this.getCount(money);
		tempArr = new int[6];
		
		for (count = 0; count < lottos.length; count++) {
			for (int i = 0; i < 6; i++) {
				tempArr[i] = getRandomNum(); // 6으로 한것은 중복 되는 것이
												// 확실하지 않다는 것을
												// 보여 주기 위해서 6으로
												// 지정
				// 비교 구문
				for (int j = 0; j < i; j++) {
					if (tempArr[j] == tempArr[i]) {
						tempArr[i] = getRandomNum();
						j = -1; // 증감식의 속성상 j++ 가 되므로 0 으로 하면 0번째를 비교를 안한다.그래서 -1로
								// 해야히 0번 부터 비교 한다.
					}
				}
			}
			for (int j = 0; j < lottos[count].length; j++) {
				lottos[count][j] = tempArr[j];
			}
		}
		
		
		for (int i = 0; i < 6; i++) {
			tempArr[i] = getRandomNum(); // 6으로 한것은 중복 되는 것이
											// 확실하지 않다는 것을
											// 보여 주기 위해서 6으로
											// 지정
			// 비교 구문
			for (int j = 0; j < i; j++) {
				if (tempArr[j] == tempArr[i]) {
					tempArr[i] = getRandomNum();
					j = -1; // 증감식의 속성상 k++ 가 되므로 0 으로 하면 0번째를 비교를 안한다.그래서 -1로
							// 해야히 0번 부터 비교 한다.
				}
			}
		}
	}

	@Override
	public void printLotto() {
		for (int i = 0; i < lottos.length; i++) { // 정렬 하기전 2차원 배열 내용 1차원 배열로
													// 복사하기
			for (int j = 0; j < lottos[i].length; j++) {
				tempArr[j] = lottos[i][j];
			}
			for (int j = 0; j < lottos[i].length; j++) {
				sort(tempArr); // 오름차순 정렬
				lottos[i][j] = tempArr[j];
				System.out.print(lottos[i][j] + "\t");
			}
			System.out.println(); // 로또 한 게임 개행
		}
		System.out.println(); // 최종 개행
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
					// 완성해 주세요
					// 포털에
					// 스왑 알고리즘 검색하면
					// 다 나옵니다.
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
	 * 금액이 결정된 뒤 몇 번 extractLottos() 를 돌린것인가? 잔돈 뺀 예를 들면 7000원이면 7회 회전 하게끔 카운트
	 * 숫자를 결정하는 로직
	 */
	@Override
	public int getCount(int money) {
		if (money < 1000) {
			return 0;
		}
		return (int) Math.ceil(money / 1000);
	}
}
