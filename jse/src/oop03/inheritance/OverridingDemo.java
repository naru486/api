package oop03.inheritance;
/*
 Method Overriding
 - 상속관계에서 Parent에 선언 된 메소드를 Child에서 다시 선언하 경우
 - 이런 경우 Parent의 메소드는 무시됨
 - 같은 메소드가 Parent와 Child에게 모두 선언 되었으나
 - 내용은 다름
 - 클래스의 다형성을 구현 할 수 있음
 - Parent와 Child 간에 메소드의 원형(메소드명, 파라미터 갯수, 파라미터 데이터 타입)이 
   같아야 함
 - Parent가 메소드를 상속해주나 Child는 자신이 구현한 메소드를 우선 사용.
 - Parent가 메소드 기능을 유지하면서 상황에 따라 Child의 변형된
 - 기능을 사용하고 싶은 경우에 사용하며 다형성 구현의 핵심원리.
 - Parent의 메소드를 갭슐화한다고 볼 수 있다.
 - Parent의 구기능을 없애는 것이 아니라,
 - 유지하면서 새로운 기능으로 교체하려는 목적으로 사용.
 * */

public class OverridingDemo {
	/*
	 Parent 의 show() 와 Child 의
	 show() 원형이 같으므로 오버라이딩이다.
	 * */
	public static void main(String[] args) {
		ParentB b =  new ParentB();
		b.show();
		ChildB c = new ChildB();
		c.show();
		
	}
}

class ParentB{
	void show(){
		System.out.println("Parent show() 수행");
	}
	void run(){
		System.out.println("부모는 달린다.");
	}
}

class ChildB extends ParentB{
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Child show() 수행");	
		super.show();
	}
}