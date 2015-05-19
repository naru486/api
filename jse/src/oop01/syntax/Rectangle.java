package oop01.syntax;

public class Rectangle {
	public int width=0;
	public int height=0;
	public Point orgin;
	
	public Rectangle() {
		orgin = new Point(0,0);
	}
	
	public Rectangle(Point p) {
		orgin = p;
	}
	
	public Rectangle(int w,int h){
		orgin = new Point(0,0);
		width=w;
		height=h;
	}
	
	public Rectangle(Point p,int w,int h){
		orgin=p;
		width=w;
		height=h;
	}
	
	// a method for moving the rectangle.
	public void move(int x, int y){
		// 원래위치 origin이라고 할 때, 파라미터 위치로 옮기는 그 기능
		orgin.x=x;
		orgin.y=y;
	}
	
	// a method for computing the area of the rectangle.
	public int getArea(){ 
		return orgin.x*orgin.y; //0 대신 공식을 대입하세요 ....직사각형 공식
	}
}
