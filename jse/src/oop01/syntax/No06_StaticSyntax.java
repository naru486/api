package oop01.syntax;

/*
 static ����
 - ���� ����
 - Ŭ������ JVM ������ �ε��ÿ� �޸� �Ҵ��� �Ѵ�.
 - ��ü�� �ؽ��ڵ�� JVM �� �ؽþ˰��� ���� ��Ű�����
 Ŭ���� ���� ���յǾ� �ؽ��ڵ尡 ����ȴ�.
 - String �� ��ü������ ���� ���� ��� �� ���� ���ڿ���
 ������ ������, �ؽ��ڵ带 �����Ѵ�.
 String str1 = "��ũ";
 String str2 = "��ũ";
 str1.hashCode() == str2.hashCode(); 
 */
/*
 static ����� ����ؾ� �� ����
 - �⺯ �� ��� �ν��Ͻ��� ���������� ����ؾ� �ϴ� �Ϳ� �ٿ� ���.
 - �ν��Ͻ� ������ ������� �ʰ�, Ŭ�������� �ٷ� �����Ϸ� �� ��.
 * */

public class No06_StaticSyntax {
	String hulk1,hulk2;
	
	public static void main(String[] args) {
		String str1 = "��ũ";
		String str2 = new String("��ũ");
		System.out.println(str1.hashCode()==str2.hashCode()?true:false);
	}
}
