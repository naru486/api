package oop02.encapsule;

public class PayService { // �ҵ� ���, ���� ���,
	
	PayVO payVO = new PayVO();
	public int taxCalculator(double salary) {
		payVO.setSalary(salary);
		return (int)(payVO.getSalary() * payVO.TAX);
	}

	public int incommCalculator(double salary) {
		payVO.setSalary(salary);
		return (int)(payVO.getSalary() - (payVO.getSalary() * payVO.TAX));
	}
}
