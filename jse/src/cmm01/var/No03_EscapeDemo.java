package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		/*
		int kor; // ���� Declation
		kor=90; // �Ҵ� Allocation
		*/
		int kor=90,eng=85,sum=0;
		sum = kor + eng;
		System.out.print("����ó��\n");
		System.out.println("���� ���� �հ�");
		System.out.println("kor	eng	sum");
		System.out.printf("%d\t%d\t%d\n",kor,eng,sum);
	}
}
