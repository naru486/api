package oop01.syntax;

class Coffee{
	public Coffee(){
		System.out.println("돈을 넣다.");
	}
	public Coffee(int money){
		System.out.println(money+"원");
	}
	public Coffee(int money,boolean exist){
		System.out.println("구매가능여부 : "+(exist == true ? "커피종류선택":"커피없음"));
	}
}

public class CoffeeA {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(500);
		Coffee c3 = new Coffee(500, true); 
	}
}
