package oop01.syntax;
/*
 생성자는 인스턴스가 생성될 때 
 호출되는 『인스터스 초기화 메서드』이다.
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
		System.out.println("돈을 넣다.");
	}
	public MilkCoffee(int money){
		this(500,true);
		System.out.println(money+"원");
	}
	public MilkCoffee(int money,boolean exist){
		System.out.println("구매가능여부 : "+(exist == true ? "커피종류선택":"커피없음"));
	}
}

public class CoffeeB {
	/*
	 * 돈을 넣다.
	   500원
	   구매가능여부 : 커피종류선택
	   ...나오는 데 생성자를 한번만 쓰세요.
	 * */
	public static void main(String[] args) {
		MilkCoffee coffee=new MilkCoffee();
		// 인스턴스는 변하지 않는 주소값을 가진 
		// 참조(Reference) 변수 이다.
	}
}
