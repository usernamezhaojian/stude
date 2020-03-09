package javase.base.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestTxtFile {
	// main��Ϊ��ڣ�һ����ֻ��һ����ڣ��涨
	// main�����������һ��Ҫ��
	public static void main(String[] args) throws IOException {
		// ִ�����е�read()����
		// 1.������Ķ���ttf����ʵ��
		TestTxtFile ttf = new TestTxtFile();

		// 2.������� read();����
		ttf.read();
		//ttf.write();

		// �������������η���static��̬�����Բ��������ֱ��ʹ��
		// TestTxtFile.read();
		// TestTxtFile.write();
	}

	// д�ı��ļ�
	public void write() throws IOException {
		File file = new File("d:/b.txt");
		OutputStream os = new FileOutputStream(file);
		//������������ַ�����utf-8
		OutputStreamWriter writer =
				new OutputStreamWriter(os, "utf-8");
		BufferedWriter bw = new BufferedWriter(writer);

		// д���ݵ������ļ���
		bw.write("java���ţ�\r\n��н��ҵ");

		// �ͷ���Դ
		bw.close();
		writer.close();
		os.close();
	}

	// ���ļ�
	public void read() throws IOException { // ����
		File file = new File("d:/b.txt");
		InputStream is = new FileInputStream(file);
		InputStreamReader reader = 
				new InputStreamReader(is, "utf-8");
		BufferedReader br = new BufferedReader(reader);

		// �������ļ���buf��С�����顣�ı��ļ����ж����ļ�β��null
		String s = ""; // ÿ�ζ�ȡһ�У�����һ�����ݱ����ַ�����
		while ((s = br.readLine()) != null) {
			System.out.println(s); // ��ӡ
		}

		// �ͷ���Դ
		br.close();
		reader.close();
		is.close();
	}
}
