package javase.base.array;

import java.util.Arrays;

/*
 * ҵ������5�����ĳɼ�����֪��
 * 1. ���ó�ʼֵ 100,98,60,88,95
 * 2. ͳ���ܷ���
 * 3. ͳ��ƽ���ɼ�
 * 4. ��óɼ�
 * 5. ���ɼ�
 */
public class TestScore {
	public static void main(String[] args) {
		//int[] scores = new int[5];
		//1. ����ʱֱ�ӳ�ʼ������д��ʽ
		int[] scores = { 50, 120, 98, 60, 88, 95, 66, 0 };
		
		//2. �ܷ���
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			//sum = sum + scores[i];
			sum += scores[i];
		}
		System.out.println("�ܷ�����" + sum);
		
		//3. ƽ��ֵ
		System.out.println("ƽ��ֵ��" + sum/scores.length);
		
		//4. ����
		Arrays.sort(scores);	//�������������������������ݻ��������������
//		for(int i=0; i< scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		String s = Arrays.toString(scores);
		System.out.println(s);
		
		//5. ���ֵ
		System.out.println("���ֵ��" + scores[scores.length-1]);
		
		//6. ��Сֵ
		System.out.println("��Сֵ��" + scores[0]);
	}
}





