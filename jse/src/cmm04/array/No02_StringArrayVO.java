package cmm04.array;

public class No02_StringArrayVO {
	String[] juso;

	public No02_StringArrayVO() {
		juso = new String[3];
	}

	public String[] member() {
		juso[0] = "����";
		juso[1] = "����";
		juso[2] = "��ȭ��";
		return juso;
	}

	public void display() {
		String[] juso = member();
		/* ��� */
		/*
		 * for (String s : juso) { System.out.printf("%s\t", s); }
		 * 
		 * System.out.println();
		 */

		int i = 0;
		for (; i < juso.length; i++) {
			System.out.println(juso[i]);
		}

		/*
		 * for (;;) { if(i==10){ break; } i++; } System.out.println(i);
		 */
	}
}
