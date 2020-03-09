package javase.base.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//�������Ŀ�ݼ���Ctrl+Shift+o �������룬������ܶ��£�ֱ�Ӿ͵���
//����жϲ��ˣ��ͳ�����ʾ��

//�����ļ�
public class TestFile {
	public static void main(String[] args) throws IOException {
		TestFile tf = new TestFile();
		//tf.write();
		tf.read();
	}
	//1.д�ļ�
	public void write() throws IOException{
		File file = new File("d:/a.txt");	//�����ļ����ļ�������d�̣��ļ���a.txt
		//�����ļ������
		OutputStream os = new FileOutputStream(file);
		
		//д�ļ�����
		String msg = "java���������\r\n��н��ҵû����!";
		os.write( msg.getBytes() );
		
		//�ͷ���Դ������gc��������������������Ѿ�û�ã������ջ�
		os.close();		//jdk1.7+�Զ��ͷ�
		System.out.println("�����ļ����");
	}
	
	//2.���ļ�
	public void read() throws IOException {
		File file = new File("d:/a.txt");
		//�����ļ�������
		InputStream is = new FileInputStream(file);
		//���ļ�ֻ��һ��һ�ж���
		byte[] buf = new byte[1024];	//�������Ʒ�ʽ��������һ��������ȡ1024�ֽ�=1m
		
		int len = 0;	//�Ѷ�ȡ���ݳ��ȴ���len������
		while( (len = is.read(buf))  != -1 ) {	//����-1�ʹ������ļ�β�ͣ��ͼ�����
			System.out.write(buf, 0, len);
		}
		
		//�ͷ���Դ
		is.close();
	}
}
