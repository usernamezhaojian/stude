package javase.base.jdbc;

public class TestJDBC {
	public static void main(String[] args) {
		//�����нӿڣ��Ƚӿڣ�newʵ����
		//��ѯһ����������������
		UserService userService = new UserServiceImpl();
		
		User user = userService.get(7);
		System.out.println(user);
		
	}
}
