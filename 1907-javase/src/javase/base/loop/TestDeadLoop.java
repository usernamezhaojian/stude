package javase.base.loop;

import org.junit.Test;

public class TestDeadLoop {
	@Test
	public void testFor() throws InterruptedException {
		for(;;) {
			//�ó����ӳ�һ�ᣬ�����̱Ƚ�����
			Thread.sleep(500);		//��λ������
			System.out.println("*");
		}
	}
	
	@Test
	public void testWhile() throws InterruptedException {
		while(true) {
			Thread.sleep(500);
			System.out.println("*");
		}
	}
}
