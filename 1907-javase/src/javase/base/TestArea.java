package javase.base;

//ר�Ŵ���������������
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;	//����ʹ��util��

import javax.xml.crypto.Data;

public class TestArea {
	public static void main(String[] args) throws ParseException {
		//3. ������ת���ַ���
		double d = 0.8;
		String s = String.valueOf(d);
		System.out.println("-"+s);
		
		//4. ����ת���ַ���
		//������ǰ����
		Date date = new Date();
		System.out.println(date);
		
		//����д����xxxx��xx��xx��
		//String pattern = "yyyy��MM��dd�� HHʱmm��ss��";		//��ʽ����ʽ
		String pattern = "yyyy-MM-dd";		//��ʽ����ʽ
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern);
		//�̷߳ǰ�ȫ�����ܹ���
		
		//�����ڰ���pattern�����
		String sDate = sdf.format(date);
		System.out.println(sDate);
		
		String pattern1 = "yyyy��M��d��";
		SimpleDateFormat sdf1 = 
				new SimpleDateFormat(pattern1);
		System.out.println( sdf1.format(date));
		
		//5. �Լ�����ʱ��
		String p = "yyyy-M-d";
		SimpleDateFormat df = new SimpleDateFormat(p);
		//���ַ�����ʽ����ת����������
		Date d1= df.parse("1988-03-15");
		System.out.println(d1);
		
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}



