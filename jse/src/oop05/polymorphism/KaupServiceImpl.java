package oop05.polymorphism;

public class KaupServiceImpl implements KaupInterface {
	int idx;
	double weight,height;
	
	KaupVO vo;
	@Override
	public int getKaupIndex(double height,double weight ) {
		vo=new KaupVO();
		this.weight=height;
		this.height=weight;
		vo.setHeight(height);
		vo.setWeight(weight);
		idx = (int) ((this.weight / (this.height * this.height)) * 10000);
		return idx;
	}

	@Override
	public String getResultMsg() {
		String msg;
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else if (idx > 10) {
			msg = "영양실조";
		} else {
			msg = "소모증";
		}
		return "카우프지수 [키=" + vo.getHeight() + " cm, 몸무게=" + vo.getWeight() + " kg, 카우프지수="
				+ getKaupIndex(vo.getHeight(),vo.getWeight()) + "]" + " " + msg;
	}
}
