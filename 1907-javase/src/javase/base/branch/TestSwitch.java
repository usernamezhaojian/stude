package javase.base.branch;

//��֧
public class TestSwitch {
	public static void main(String[] args) {
		//���󣺵绰���� 110/120/119/114
		String phone = "158";
		String rtn = "";
		
		//switch��һ��case���������ȫ�����жϣ�����ֱ��ִ��
		//�ж��������ֵ����Ķ�Ӧ����
		switch (phone) {	
		case "110":
			rtn = "���񾯲�";
			break;	//ִ������������ݣ�ֱ��switch����
		case "120":
			rtn = "ҽ����ʿ";
			break;
		case "119":
			rtn = "�𾯵绰";
			break;
		case "114":
			rtn = "�˹����";
			break;
		default:	//Ĭ��
			rtn = "�Ƿ��绰";
			break;
		}
		System.out.println(rtn);
		
		
		//�ж�һ���ַ�
		char c = 'c';	//char����֧������
		c = 101;		// ASCII ������׼�涨�����ֶ�Ӧ����
						// a=97 bit=8��0����1
		//Ϊʲô���������ת���������ʶ����Ϣ������ASCII
		
		System.out.println(c);
		
		switch(c) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		}
	}
	
}
