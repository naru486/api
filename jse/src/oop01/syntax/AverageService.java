package oop01.syntax;

public class AverageService {
	//VO 에 있던 avg(),  tot() 메소드를
	//서비스에서 처리
	AvarageDVO avarageDVO=new AvarageDVO();
	
	public int tot(){
		int result=avarageDVO.getEng()+avarageDVO.getKor();
		return result;
	}
	
	public double avg(){
		double result=tot()/2d;
		return result;
	}
	
	public String name(){
		String name=avarageDVO.getName();
		return name;
	}
	
	
	public void add(String name, int kor,int eng){
		avarageDVO.setName(name);
		avarageDVO.setKor(kor);
		avarageDVO.setEng(eng);
	}
}
