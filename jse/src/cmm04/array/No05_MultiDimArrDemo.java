package cmm04.array;
/* 
 Java �� ���� ���� 5-10
  
 */

public class No05_MultiDimArrDemo {
	public static void main(String[] args) {
		int[][] score={
				{90,90,90}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("=============================================");
		
		for (int i = 0; i < score.length; i++) {
			int sum=0;
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			System.out.print((i+1)+"\t");
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(sum+"\t"+sum/(float)score[i].length);
		}
		System.out.println("=============================================");
		//�Ʒ� �������� ����, ����, ���� ������ ������ �ϼ���
		System.out.println("���� :\t"+korTotal+"\t"+engTotal+"\t"+mathTotal);
	}
}
