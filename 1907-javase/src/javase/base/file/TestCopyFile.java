package javase.base.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �ļ����ƣ���һ���ļ���һ��һ��Ķ�buffer
 * �Ѷ�ȡ�������ݣ�д������һ���ļ�
 */
public class TestCopyFile {
	/*
	 * �������裺
	 * 1��Դ�ļ���Ŀ���ļ�
	 * 2����Դ�ļ��ж�ȡ���ݣ��ļ�������
	 * 3���߶���д����ֹ���ݹ����ڴ治����
	 * 4���ͷŹر���Դ
	 */
	public static void main(String[] args) throws IOException {
		TestCopyFile tcf = new TestCopyFile();
		File srcFile = new File("d:/jy2015.rar");
		File destFile = new File("d:/a1.rar");

		//ִ��ʱ�䣿 start��end����ʱ��end-start
		
		long start = System.currentTimeMillis();	//��ǰ������
		tcf.copyFile(srcFile, destFile);
		long end = System.currentTimeMillis();
		
		System.out.println("��ʱ��" + (end-start) + " ����");
	}
	
	//�ļ���Ϊ��������
	public void copyFile(File srcFile, File destFile)
			throws IOException {
		InputStream is = new FileInputStream( srcFile );
		OutputStream os = new FileOutputStream( destFile );
		
		byte[] buf = new byte[10240];	//10m
		
		int len = 0;
		//���ļ�
		while( (len = is.read(buf)) != -1) {
			//д�ļ�
			os.write(buf, 0, len);
		}
		
		//�ͷ���Դ�����ͷ����Ķ������ͷ�������
		os.close();
		is.close();
	}
}






