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
			msg = "��";
		} else if (idx > 24) {
			msg = "��ü��";
		} else if (idx > 20) {
			msg = "����";
		} else if (idx > 15) {
			msg = "��ü��";
		} else if (idx > 13) {
			msg = "����";
		} else if (idx > 10) {
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}
		return "ī�������� [Ű=" + vo.getHeight() + " cm, ������=" + vo.getWeight() + " kg, ī��������="
				+ getKaupIndex(vo.getHeight(),vo.getWeight()) + "]" + " " + msg;
	}
}
