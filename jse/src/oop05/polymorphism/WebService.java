package oop05.polymorphism;

public interface WebService extends WebDao {
	public String getAge();
	public String setAge();
	public String updateAge();
	public String deleteAge();
}
