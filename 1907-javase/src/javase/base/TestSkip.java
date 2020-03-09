package javase.base;

import org.junit.Test;

public class TestSkip {
	@Test
	public void testBreak(){
		System.out.println("\n���� break");
		for(int i=0; i<6; i++) {
			if(i==3) {
				//�˳�ѭ��
				break;
			}
			System.out.println(i);
		}
		System.out.println("ִ�����");
	}
	
	@Test
	public void testContinue(){
		System.out.println("\n���� continue");
		for(int i=0; i<6; i++) {
			if(i==3) {
				//��������ѭ����ִ����һ��
				continue;
			}
			System.out.println(i);
		}
		System.out.println("ִ�����");
	}
	
	@Test
	public void testReturn(){
		System.out.println("\n���� return");
		for(int i=0; i<6; i++) {
			if(i==3) {
				//����main����������
				return;
			}
			System.out.println(i);
		}
		System.out.println("ִ�����");
	}
}
