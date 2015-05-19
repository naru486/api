package oop02.encapsule;

public class PayService { // 소득 계산, 세금 계산,
	
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
