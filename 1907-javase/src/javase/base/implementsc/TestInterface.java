package javase.base.implementsc;

//���ýӿ�
public class TestInterface {
	public static void main(String[] args) {
		//�ӿںͳ�����һ��������new��new��������Ҳִ�в��ˣ�û����
		//�ӿڣ�ʵ������ = new ����ʵ���࣬an����ʵ����
		Animal an = new AnimalImpl();
		an.eat();
		an.run();
	}
}
