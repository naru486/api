package oop05.polymorphism;

public interface NumberMatchService {
	/*
	 * ��ǻ�Ͱ� �������� �����ϴ� ����
	 * 0 �� 1�� �߻� ��Ŵ
	 * */
	public int makeComVal(int player); //game �޼ҵ�
	/*
	 * �� ���� �Ķ���͸� �񱳻��� ��ġ�ϸ� true
	 * �ٸ��� false�� return
	 * */
	public boolean match(int playVal,int comVal);
	/*
	 * makeComVal() �� ���ϰ��� true �� �÷��̾� �¸�
	 * false �� ��ǻ�� �¸� ��� �޽��� ���
	 * */
	public String display();
}
