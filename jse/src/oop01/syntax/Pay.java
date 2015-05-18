package oop01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX=0.1;
	
	public static void main(String[] args) {
		Pay pay=new Pay();
		pay.name="헐크";
		pay.salary=(int)(3000000*(1-TAX));
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+pay.salary+"원 입니다.");
		pay.name="아이언맨";
		pay.salary=5000000-(int)(TAX*5000000);
		System.out.printf("=== %s의 5월달 실급여는 %d원 입니다.\n",pay.name,pay.salary);
		pay.name="토르";
		pay.salary=1000000-(int)(TAX*1000000);
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+pay.salary+"원 입니다.");
	}
}
