package javase.base;

public class TestValue {
	public static void main(String[] args) {
		//���� variable
		boolean b = false;
		System.out.println("�������ͣ�" + b);

		char c = ' ';
		System.out.println("�ַ����ͣ�" + "-"+c+"-");
		
		byte t = 0;
		System.out.println("�ֽ����ͣ�" + t);
		
		short s = 0;
		System.out.println("�����ͣ�" + s);
		
		int i = 0;
		System.out.println("���ͣ�" + i);
		
		long l = 0;
		System.out.println("�����ͣ�" + l);
		
		float f = 0.0f;
		System.out.println("�����ȸ����ͣ�" + f);
		
		double d = 0.0d;
		System.out.println("˫�����ȸ����ͣ�" + d);
		
		System.out.println();
		
		//���� const
		final double PI = 3.14d;
		System.out.println("Բ���ʣ�" + d);
		
		final double GOLDEN_SECTION = 0.618d;
		System.out.println("�ƽ�ָ��ߣ�" + d);
	}
}
