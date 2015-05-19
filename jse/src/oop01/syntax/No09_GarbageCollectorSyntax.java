package oop01.syntax;

/*
Garbage Collector 가비지 콜렉팅
 - 자바 가상기계 자동으로 수행함
 - 멤버메소드 안에서 생성된 객체는 메소드 종료時 전부 메모리가 회수함
 - 멤변은 메모리 회수 과정을 따로 거치게 됨
 - 참조를 하지 않는 메모리 수집, System.gc()
 - 우선 순위가 낮은 스레드로 수행.
   일반적인 경우 모든 스레드가 종료된 후 수행
 - gc() 를 실행하면 강제로 메모리 회수 작업을 하게 되어
   finalize() 가 호출된다. 그러나 gc() 자체는 
   많은 부하를 동반하므로 JVM 이 실행하도록 함
 * */

public class No09_GarbageCollectorSyntax {
	public static void main(String[] args) {
		Garbage[] ga=new Garbage[10];
		//객체 생성
		for (int i = 0; i < ga.length; i++) {
			ga[i]=new Garbage(10);
		}
		//객체 메모리 해제
		for (int i = 0; i < ga.length; i++) {
			ga[i]=null; // 메모리 회수 대상이 됨
		} 
		//강제로 메모리 해제
		System.gc();
	}
}

class Garbage{
	int objNo;
	public Garbage(int n) {
		objNo = n;
		System.out.println("Garbage class"+objNo+"이 만들어짐...");
	}
	// 객체가 메모리 회수할 시 자동으로 호출됨
	protected void finalize() throws Throwable {
		System.out.println("Garbage Class"+objNo+"에서 쓰이던 메모리가 회수됨...");
		super.finalize();
	}
}