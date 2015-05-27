package api.lang.object;
/*
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을
 * 알아보기 위해 instanceof 연산자를 사용한다.
 * 연산의 결과로는 true와 false 중 하나를 리턴한다.
 * */

public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Amblulance amblulance =new Amblulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
	}
	
	public void doWork(Car c){
		/*
		 * FireCar 가 Car 타입인지 확인 후
		 * true 이면, FireCar 타입으로 객체 캐스팅 하라.
		 * */
		if(c instanceof FireCar){
			FireCar f=(FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
		}else if(c instanceof Amblulance){
			/*
			 * Amblulance 가 Car 타입인지 확인 후
			 * true 이면, Amblulance 타입으로 객체 캐스팅 하라.
			 * */
			Amblulance a =(Amblulance) c;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}

class Car{
	String color;
	int door;
	void driver(){
		System.out.println("운전중...");
	}
	void stop(){
		System.out.println("Stop!!!");
	}
}

class FireCar extends Car{ //Car 클래스를 상속받은 FireCar 클래스
	void shootWater(){
		System.out.println("물뿌려 끄는 중...");
	}
}

class Amblulance extends Car{ //Car 클래스를 상속받은 Amblulance 클래스
	void siren(){
		System.out.println("사이렌을 울리고 가는 중");
	}
}
