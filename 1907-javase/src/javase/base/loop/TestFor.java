package javase.base.loop;

public class TestFor {
	public static void main(String[] args) throws Exception {
		for(
				int i=0;			//��һ��ִ��
				i<7;				//�ڶ���ִ��
				i++					//���Ĳ�ִ��
			) {						
			System.out.println(i);	//������ִ��
		}
		
		int len = 10;
		for(int i=0;i<len;i++) {
			if(i%2==0) {	//���������������߶���
				continue;	
			}
			
			//ǰ��ռ����ո�
			for(int k=0;k<((len-i)/2);k++)
				System.out.print(" ");
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			//һ�������ɺ��������
			System.out.println();
		}

	}
}
