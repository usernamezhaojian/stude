package javase.base.loop;

public class TestDoWhile {
	public static void main(String[] args) {
		int j = 0;
		while(j<0) {		//����������
			System.out.println(j);
			j++;
		}
		
		System.out.println("");
		
		int i = 0;
		do{	//���������Ƿ��������ִ��һ��
			System.out.println(i);
			i++;
		}while(i<0);
	}
}
