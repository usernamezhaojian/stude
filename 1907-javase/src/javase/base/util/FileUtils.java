package javase.base.util;

//��Ŀ������
public class FileUtils {
	
	//�����ļ�����Ŀ¼��ת����ȫ��
//D:\java\ws\1907\1907-javase\bin\javase\base\HelloWorld.class
//D:\java\ws\1907\1907-javase\bin\
	public static String getClassFullName(
				String filename, String baseDir
			) {
		//1.���ļ�����ȥ����׼·��
		int pos = baseDir.length();	//��ȡ��ʼλ��
		String s = filename.substring(pos);
		
		//2.�滻���ݣ�������ʽ
		//\ת��\б��\ת��\б��
		s = s.replaceAll("\\\\", ".");
		
		//3.ȥ��.class��׺
		//a.�滻��.class �滻 ""
		//b.substring������6
		//c.substring lastIndexOf(".")	������·ͨ��������ͬ��д��ͬ��ʵ��
		
		//javase.base.HelloWorld.class
		
		s = s.substring(0, s.lastIndexOf("."));
		
		return s;
	}
	
	//��ȡ��һ�������ࣺ����һ��ȫ�޶���������ʵ������
		public static String getInstanceName(String classFullName) {
			//String classFullName = "javase.base.HelloWorld";
			//�ָ��ַ�������ȡ�õ��������Ԫ��
			//������ʽ��.����ÿ���ַ�������ת��\
			String[] arr = classFullName.split("\\.");
			String className = arr[ arr.length -1  ];	//��������һ��Ԫ��
			
			//ʵ�����ƣ�����ĸСд��1)��ȡȫСд��2��charAt(0) ��3���ش�
			String instanceName =  className.toLowerCase().charAt(0)
					+ className.substring(1);

			return instanceName;
		}
	
}
