package javase.base.exception;

public class TestFinally {
	public static void main(String[] args) {
		try {	//try����Ĵ������ִ��
			String name = "tony";
			int i = 3/0;	//�׳��쳣
		} catch(Exception e) {	//ֻ�г����쳣��ִ��
			System.out.println(e.getMessage());
		} finally {	//���ִ�У��Ը��Ӷ����ͷ���Դ
			System.out.println("����ִ������");
		}
	}
}
