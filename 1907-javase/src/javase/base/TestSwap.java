package javase.base;

//��������������ֵ
public class TestSwap {
	public static void main(String[] args) {
		int a = 10;	//����һ�����α�������ʼ��ֵ10
		int b = 20;	//����һ�����α�������ʼ��ֵ20
		
		System.out.println("a=" + a + " b=" + b);
		
		//����һ���м���ʱ�������ݴ�a��ֵ
		int t = b;
		
		//��a������ֵ��ֵ��b������b������ֵ�ͱ�����
		b = a;
		
		//����ʱ�ݴ�����л�ȡ���ȱ����ֵ
		a = t;
		
		System.out.println("a=" + a + " b=" + b);
	}
}
