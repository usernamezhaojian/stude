package javase.base.array;

import java.util.Random;		//����jar����

public class TestRandom {
	public static void main(String[] args)  throws Exception{
		//�������ͣ����Ӷ���ͨ�� new ��ʽ����
		int[] arr = new int[50];	//����һ��int���飬�����С��ֻ�ܷ�5��
		System.out.println("���鳤�ȣ�" + arr.length);
		
		//������ÿ��Ԫ����һ�����ֵ�����빤����Random
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Random().nextInt(20);		//�������1~10�ķ�Χ������
			System.out.println( arr[i] );
		}
	}
}
