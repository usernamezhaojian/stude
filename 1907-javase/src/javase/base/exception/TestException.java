package javase.base.exception;

public class TestException {
	public static void main(String[] args) throws Exception{
		//���������쳣
		//ģ���������벻��ȷ���������׳��쳣
		
		try {
			String password = "123456";
			throw new Exception(""); 	//�׳��쳣
		} catch (Exception e) {	//�����쳣
			//�����׳�����
			throw new Exception("�������! ");
		}
		
		//�����������̿���
		
		//��ʬ���룬������ִ�� Unreachable code
		//System.out.println("�����");	
		
	}
}
