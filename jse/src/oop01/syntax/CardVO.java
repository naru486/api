package oop01.syntax;
/*
 Date : 2015/05/19
 Author : ��ȣ��
 Desc : static ����
 * */
public class CardVO {
	private String kind;		//ī���� ����
	private int number;			//ī���� ����
	static int width = 100;		//ī���� ��
	static int height = 250;	//ī���� ����

	CardVO(String kind,int number){
		this.kind=kind;
		this.number=number;
	}

	public int getNumber() {
		return number;
	}

	public String getKind() {
		return kind;
	}
 
}
