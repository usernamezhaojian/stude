package javase.base.loop;

public class TestWhile {
	
	
	public static void main(String[] args) {
		//while�ṹ��ҲҪ��ʼֵ��Ҳ���ж�������һ��Ҫ�ı�����
		int i = 0;	//��forѭ����ͬ���ǣ���ʼ��������whileǰ��
		
		//for(int i=0;i<10;i++){}
		while(i<10) {	//�ж�����
			if(i==6) {
				
				//ֱ���˳�
				//break;	//�����ж�ִ��
				//return;	//��������
				continue;	//����ִ��
			}			
			//�������ڸı�ֵ
			System.out.println(i);
			i++;

		}
		System.out.println("ִ�����");
	}
}
