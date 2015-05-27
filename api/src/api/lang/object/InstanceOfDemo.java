package api.lang.object;
/*
 * ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ����
 * �˾ƺ��� ���� instanceof �����ڸ� ����Ѵ�.
 * ������ ����δ� true�� false �� �ϳ��� �����Ѵ�.
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
		 * FireCar �� Car Ÿ������ Ȯ�� ��
		 * true �̸�, FireCar Ÿ������ ��ü ĳ���� �϶�.
		 * */
		if(c instanceof FireCar){
			FireCar f=(FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
		}else if(c instanceof Amblulance){
			/*
			 * Amblulance �� Car Ÿ������ Ȯ�� ��
			 * true �̸�, Amblulance Ÿ������ ��ü ĳ���� �϶�.
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
		System.out.println("������...");
	}
	void stop(){
		System.out.println("Stop!!!");
	}
}

class FireCar extends Car{ //Car Ŭ������ ��ӹ��� FireCar Ŭ����
	void shootWater(){
		System.out.println("���ѷ� ���� ��...");
	}
}

class Amblulance extends Car{ //Car Ŭ������ ��ӹ��� Amblulance Ŭ����
	void siren(){
		System.out.println("���̷��� �︮�� ���� ��");
	}
}
