package javase.base.extends2;

//�����࣬С�鳤����һ�룬����һ��
public abstract class Animal {
	public void eat() {
		System.out.println("��Ҫ�Է�");
	}
	
	//�涨һ����������ȥʵ��
//	public void run() {
//		System.out.println("�һ���");
//	}
	//abstract���󷽷���û�з����壬˭�̳����ͱ���ʵ�����������
	//���һ�������г��󷽷����������Ҳ���������
	abstract public void run();
	
}
