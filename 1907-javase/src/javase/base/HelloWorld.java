package javase.base;

//���������jar֧�֣����Ǳ���д�õĹ�����
import java.util.Date;		//ǧ�������ˣ�ţͷ��������

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println();
		
		System.out.println("==ϵͳ������Ϣ===========��");
		System.out.println("java�İ汾�ţ�"+System.getProperty("java.version"));
		System.out.println("java������Ŀ¼��"+System.getProperty("java.home"));
		
		System.out.println("�����ĵ�¼�û���"+System.getProperty("user.name"));
		System.out.println("Ĭ�ϴ洢�ļ�·����"+System.getProperty("user.dir"));
		
		System.out.println("��ǰ��������" + System.currentTimeMillis());
		System.out.println("��ǰ��������" + System.nanoTime());
		
		System.out.println("��ǰ���ڣ�" + new Date(0));
	}
}
