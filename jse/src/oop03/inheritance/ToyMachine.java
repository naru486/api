package oop03.inheritance;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ToyMachine {
	private Vector<ToyVO> toys;
	private ToyVO toy;
	
	public ToyMachine() {
		this(10,5);
	}
	
	public ToyMachine(int capa, int increment) {
		toys = new Vector<ToyVO>(capa,increment);
	}
	
	public void regist(String name,int price,ToySpec spec){
		ToyVO toyVO=new ToyVO(name,price,spec);
		toys.addElement(toyVO);
	}

	public Vector<ToyVO> searchName(String name){
		Vector<ToyVO> catchToys = new Vector<ToyVO>();
		for (int i = 0; i < catchToys.size(); i++) {
			while (toy instanceof ToyVO) {
				if (toy.getName().equalsIgnoreCase(name)) {
					catchToys.add(toy);
				}
				System.out.println(toy.getName()+" 인형");
			}
		}
		return catchToys;
	}
	
	public List<ToyVO> searchSpec(ToySpec searchSpec){
		List<ToyVO> catchToys=new ArrayList<ToyVO>();
		Enumeration<ToyVO> e=toys.elements();
		while (e.hasMoreElements()) {
			ToyVO toyVO = (ToyVO) e.nextElement();
			ToySpec toySpec = toy.getSpec();
			if(toySpec.equals(searchSpec)){
				catchToys.add(toy);
			}
		}
		return catchToys;
	}
	
	public List<ToyVO> getAll(){
		return toys;
	}
	
	public static void main(String[] args) {
		ToyMachine toyMachine = new ToyMachine();
		ToySpec spec = new ToySpec();
		spec.setProperty("사용자",ToyUser.ADULT);
		spec.setProperty("타입",ToyType.DOLL);
		toyMachine.regist("스파이더맨", 50000, spec);
		
		List<ToyVO> list = toyMachine.getAll();
		
		for (ToyVO toy: list) {
			System.out.println(toy);
		}
	}
}
