package javase.base;

import java.util.Scanner;	//����

public class PersonInfo {
	public static void main(String[] args) {
		//�Ӽ�����������
		/*
		 * String �ַ���
		 * name ������������֪��
		 * new �½�����
		 * Scanner �������
		 * System.in ����InputStream ������
		 * nextLine() ��һ��ֵ��¼����ʱ��ɣ��س�ǰ���ݸ��Ƹ�name����
		 * =��ֵ��˼
		 */
		String name = new Scanner(System.in).nextLine();
		
		//�����������䣬��ӡ���䣬����
		int age = new Scanner(System.in).nextInt();
		
		//��˾��Ϣ
		String compony = new Scanner(System.in).nextLine();
		
		//�ַ��������������ӣ�������ַ���
		System.out.println(name + " " + age + " " + compony);
	}
}




