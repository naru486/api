package oop01.syntax;
/*
 �����ڴ� �ν��Ͻ��� ������ �� 
 ȣ��Ǵ� ���ν��ͽ� �ʱ�ȭ �޼��塻�̴�.
 * */
class MilkCoffee{
	int money;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public MilkCoffee(){
		this(500);
		System.out.println("���� �ִ�.");
	}
	public MilkCoffee(int money){
		this(500,true);
		System.out.println(money+"��");
	}
	public MilkCoffee(int money,boolean exist){
		System.out.println("���Ű��ɿ��� : "+(exist == true ? "Ŀ����������":"Ŀ�Ǿ���"));
	}
}

public class CoffeeB {
	/*
	 * ���� �ִ�.
	   500��
	   ���Ű��ɿ��� : Ŀ����������
	   ...������ �� �����ڸ� �ѹ��� ������.
	 * */
	public static void main(String[] args) {
		MilkCoffee coffee=new MilkCoffee();
		// �ν��Ͻ��� ������ �ʴ� �ּҰ��� ���� 
		// ����(Reference) ���� �̴�.
	}
}
