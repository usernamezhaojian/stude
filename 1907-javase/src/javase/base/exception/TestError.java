package javase.base.exception;

public class TestError {	//throws���������׳����쳣
	public static void main(String[] args) throws Exception{
		//�Լ������쳣
		
		String name = "tony";
		try {
			//�ѿ��ܳ��ֵ��쳣�Ĵ������try{}
			int i = 3/0;	//�Ƿ�������û�д�
			System.out.println(i);
		} catch (Exception e) {	//�����쳣��Exception���쳣��
			//�Լ��������������쳣���������쳣
			
			
			//��ӡ�쳣��Ϣ�����Ǹ�������Ա����
			//΢���档getMessage()��ȡ�쳣��Ϣ
			//System.out.println(e.getMessage());
			
			//��ϸ��Ϣ��Stack�쳣ջ��Ϣ��ջ�洢�쳣��Ϣ����
			//e.printStackTrace();
			
			//���û�������ʾ�û������
			String msg = "ϵͳ�쳣������ϵ����Ա!";
			//���쳣ת�����׳����׳���ϵͳ�ĵ�����
			throw new Exception(msg);
		}
		
	}
}
