package javase.base.ploy.person;

public class TestPerson {
	public static void main(String[] args) {
		//���ƣ�����ת�ͣ��Զ���
		//����׶����󿴣����н׶����ҿ�
		Person s = new Student();	//ϵͳ�ṹ����չ��
		s.eat();
		
		Person p = new Teacher();
		p.eat();
		
		//�ܷ��������ĸ��Է�����������չ�ķ���
		//p.teach();	����׶����󿴣�p�ʹ���Person��Personû��teach()���Ա���
		
		//��������������Է���������ת�ͣ�ǿ�ƣ�
		Teacher t = (Teacher)p;	//ǿ��ת��
		t.eat();
		t.teach();
		
		Student s1 = (Student)s;
		s1.eat();
		s1.study();
	}
}


