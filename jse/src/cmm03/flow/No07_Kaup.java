package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	/*
	No07_Kaup(){
		this(0,0);
	}*/
	
	No07_Kaup(double i,double j){
		this.height=i;
		this.weight=j;
		this.idx=(int)((weight/(height*height))*10000);
	}
	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = scanner.nextDouble();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = scanner.nextDouble();
	}

	String getMsg(){
		String msg="";
		if(idx>30){msg="��";}
		else if(idx>24){msg="��ü��";}
		else if(idx>20){msg="����";}
		else if(idx>15){msg="��ü��";}
		else if(idx>13){msg="����";}		
		else if(idx>10){msg="�������";}
		else {msg = "�Ҹ���";}
		return msg;
	}
	
	@Override
	public String toString() {
		return 
				"ī�������� [Ű=" + height + ", ������=" + weight + ", ī��������="
				+ idx +"]";
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ��� : ");
		double height=scanner.nextDouble();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight=scanner.nextDouble();
		
		scanner.close();
		/*
		 * �ڵ� �ϼ�
		 * 2�� ������.....
		 * */
		No07_Kaup no=new No07_Kaup(height,weight);
	
	    System.out.println(no.toString()+" "+no.getMsg());
		System.out.println("�Ϸ�");
	}
}
