package oop01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX=0.1;
	
	public static void main(String[] args) {
		Pay pay=new Pay();
		pay.name="��ũ";
		pay.salary=(int)(3000000*(1-TAX));
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"�� �Դϴ�.");
		pay.name="���̾��";
		pay.salary=5000000-(int)(TAX*5000000);
		System.out.printf("=== %s�� 5���� �Ǳ޿��� %d�� �Դϴ�.\n",pay.name,pay.salary);
		pay.name="�丣";
		pay.salary=1000000-(int)(TAX*1000000);
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+pay.salary+"�� �Դϴ�.");
	}
}
