package api.util.vector.answer;
import java.util.Vector;

public interface GradeService {
	/*
	 * vo ��ü ���Ϳ� �����ϴ� ���
	 * */
	public void input(GradeVO vo);
	public void print();
	/*
	 * �й��� �̿��ؼ� ����ǥ�� �����(complete)
	 * */
	public String searchGradeByHak(String hak);
	/*
	 * �̸� �̿��� ���� ���
	 * �������� ���̽����� Ŀ���ϱ� ����
	 * ���ϰ��� ���� ���ͷ� �޾ƾ� ��.
	 * */
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}

/*
 1. VO, Interface Ŭ�������̾�׷�
 2. VO getter,setter ..implement
 3. ��� �߿� Total �� ���ϴ� ����� �ʿ��ѵ�..
    Total �� ���ϱ� ���ؼ���
    ���� ���� ���� �ʿ��ϰ�, ������
    VO ���� �� ���ϹǷ�...
    ���� ���ϴ� ��ɰ�
    toString() ����� VO���� �����ϰڴ�.
  4. �ϴ� VO �� �ϼ��ߴٰ� ���� Holding
  5. * impl() �� ����... �޼ҵ带 �м��� ���Ҵ�.
     ���� ���� ��µ���....
  	��input()
  	��print()
  	��searchGradeByHak()
  	��searchGradeByName()
  	��descGradeTotal()
  	��ascGradeTotal()
  	����� ����� �����ؼ� ����ǰ(������Ÿ��)�� �����.
  	�� �� ��, �׽�Ʈ ���� ������ ���̶�� �ǹ��� "���� ��"�̶� �Ѵ�.
 * */
