package javase.base;

public class Person {
	Integer id;
	String name;	
	
	public void kill() {	
		System.out.println("���ɱ���е���");
	}
	
	public void work() {
		System.out.println("Ŭ����������Խ����");
	}
	
	public void work(String who) {
		System.out.println(who + "Ŭ����������Խ����");
	}

	public static void main(String[] args) {
		//������һ������
		Person p1 = new Person();
		p1.id = 007;
		p1.name="James Bond";
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		
		p1.kill();
		
		System.out.println("===============");
		
		//�����ڶ�������
		Person p2 = new Person();
		p2.id = 001;
		p2.name="������";
		
		System.out.println(p2.id);
		System.out.println(p2.name);
		
		p2.work();
		p2.work(p2.name);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}
