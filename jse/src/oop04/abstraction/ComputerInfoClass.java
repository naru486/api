package oop04.abstraction;

public class ComputerInfoClass extends ProductInfoClass{
	/*
	 * ProtectInfoClass �� �ִ� 
	 * �⺯�� private �̹Ƿ� ������ �Ұ����մϴ�.
	 * ���� �߻�Ŭ������ protected ����
	 * ���� �����ߴµ� ������ private���� ��������
	 * �׷��� �⺯�� ���� ������ü�� �θ� �ִ�
	 * displayInfo() �� ȣ���ؼ� ó���մϴ�.
	 * */
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo(){
		// �����ϼ���
		super.displayInfo();
		System.out.println("cpu ���� : "+this.cpu);
		System.out.println("���θ޸� ���� : "+this.ram);
		System.out.println("���θ޸� ���� : "+this.hdd);
	}
	
	public void setInfo(String company,String name
			,String sid,String cpu,String ram
			,String hdd){
		/*
		 * �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super�� ����
		 * �θ� �޼ҵ��� �Ķ���ͷ� ������
		 * �ٷ� set �մϴ�.
		 * ��, �⺯�� ������ �θ��ڽ� ���迡��
		 * �����ϹǷ�, �θ��� �⺯�� ���� ���� ���� ����
		 * ������.
		 * */
		super.setInfo(company, name, sid);
		this.cpu=cpu;
		this.ram=ram;
		this.hdd=hdd;
		
	}
}
