package javase.base.extendsc;

public class TestSon {
	public static void main(String[] args) {
		Son son = new Son();
		//son.oldAge();	//˽�к���������Ͳ��ܱ��̳�
		son.house();
		son.money();
		son.play();
		
		System.out.println(son.getClass()); 	//ȫ·����ȫ���޶���
		//class javase.base.extendsc.Son
		//��ȡ������ĸ��� super����������
		System.out.println( son.getClass().getSuperclass() );
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass() );
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass().getSuperclass() );
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass().getSuperclass()
				.getSuperclass()
				);
		//��������û�г�ʼ��ʱnull�������null�������з����׳��쳣����ָ��
		System.out.println( son.getClass()
				.getSuperclass().getSuperclass().getSuperclass()
				.getSuperclass().getSuperclass()
				);		
	}
}
