package javase.base.extends2;

//��֮���ϵ
public class Tiger extends Animal{
	public void eat() {
		System.out.println("�ϻ�������");
	}
	
	@Override		//��д�����Ǹ��෽��
	public void run() {
		System.out.println("�ϻ��ܵĿ�");
	}

}
