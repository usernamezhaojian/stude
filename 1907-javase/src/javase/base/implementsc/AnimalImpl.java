package javase.base.implementsc;

//�ӿ�ʵ���࣬ϰ�߹淶���ӿ�����Impl
//�����ͽӿڹ�ϵ������ʵ�ֽӿڵ����з���
public class AnimalImpl implements Animal{

	@Override
	public void eat() {
		System.out.println("�Է���");
		
	}

	@Override
	public void run() {
		System.out.println("�ܲ���");
	}

}
