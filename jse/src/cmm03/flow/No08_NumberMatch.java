package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMatch {
	public static void main(String[] args) {
		No08_NumberMatchVo vo =new No08_NumberMatchVo();
		System.out.println("�� 3ȸ�� �Է� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("1���� 5���� ������ �Է��ϼ���");
			int result=0;
			try {
				int input=scanner.nextInt();
				vo.setPlayer(input);
				
			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
			}
			
			if (vo.getPlayer()==0) {
				System.out.println("�ٽ� �Է��� �ֽʽÿ�");
			}else{
				vo.setCom();
				result=vo.game(vo.getCom(), vo.getPlayer());
			}
			
			if(result==1){
				System.out.println("������ϴ�."
						+ " ������ �����մϴ�.");
				break;
			}else if (i==2) {
				System.out.println("3ȸ ��� �����߽��ϴ�."
						+ "\n���ӿ��� �й��߽��ϴ�."
						+ "\n������ �����߽��ϴ�.");
				break;
			}
		}
	}
}