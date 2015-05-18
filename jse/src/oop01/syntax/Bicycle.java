package oop01.syntax;

public class Bicycle {
	private int cadence;
	private int geer;
	private int speed;
	private int id;
	private static int numberOfBicycles = 0;
	
	public Bicycle(int startCadence,int startGear,int startSpeed){
		super();
		this.cadence=startCadence;
		this.geer=startGear;
		this.speed=startSpeed;
		this.id=++numberOfBicycles;
	}
	
	public int getCadence() {
		return cadence;
	}
	public void setCadence(int newValue) {
		this.cadence = newValue;
	}
	public int getGeer() {
		return geer;
	}
	public void setGeer(int newValue) {
		this.geer = newValue;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newValue) {
		this.speed = newValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/* 사용자 정의 메소드 */
	public void applyBreak(int decrement){
		speed-=decrement;
	}
	public void speedUp(int increment){
		speed+=increment;
	}
	
}
