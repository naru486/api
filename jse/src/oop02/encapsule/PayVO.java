package oop02.encapsule;

public class PayVO {
	private String name;
	private double salary;
	static final double TAX=0.1;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return (int)salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
