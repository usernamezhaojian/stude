package javase.base.extendsc;

public class B extends A{
	//�͸��෽����������һ�£�����ֵ����һ�£���������һ�£���������һ��
	//Ҳ��Ϊ���ǡ���д overide����д�������û�а�ȫ���⣡
	public String show(String name) {
		System.out.println("B.show " +name);
		return name+" 123";
	}
	
	public void exe() {
		show("tony");
	}
	
	//�������е��ø���
	public void execute() {
		
		//��ʱshow�Ǹ��ࣿ���ࣿ
		//String name = "tony";
		String name = show("tony");
		System.out.println(name);
		
		//Ҫ��ȷ�����Լ���show���� this
		System.out.println("this=");
		this.show(name);
		
		//this.getClass().getSuperclass()
		//Ҫ��ȷ���ø����show����
		super.show123("hellen");
	}
	
	public static void main(String[] args) {
		B b = new B();
		//b.execute();
		
		b.exe();
	}
}
