package oop03.inheritance;

public class ToyVO {
	private String name;
	private int price;
	private ToySpec spec;
	
	public ToyVO(String name2, int price2, ToySpec spec2) {

	}
	public String getName() {
		return name;
	}
	/*
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSpec(ToySpec spec) {
		this.spec = spec;
	}
*/
	public ToySpec getSpec() {
		// TODO Auto-generated method stub
		return spec;
	}
}
