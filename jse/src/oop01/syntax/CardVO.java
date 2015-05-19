package oop01.syntax;
/*
 Date : 2015/05/19
 Author : 김호영
 Desc : static 예제
 * */
public class CardVO {
	private String kind;		//카드의 무늬
	private int number;			//카드의 숫자
	static int width = 100;		//카드의 폭
	static int height = 250;	//카드의 높이

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
