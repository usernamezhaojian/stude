package javase.base.oop;

public class Person {
	//��Ա����
	private Integer id;
	private String name;
	String company;
	
	
	//���췽�����޲ι���
	public Person() {
		System.out.println("����Ĭ�Ϲ��췽��");
	}
	
	//���췽�����вι���
	public Person(Integer id) {
		this.id = id;		//��ʼ��
		System.out.println("���ι��죬���г�ʼ��");
	}
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("���ι��죬���г�ʼ��");
	}
	
	//����
	public void kill() {
		int x = 90;	//�ֲ�����
		
		System.out.println("����ɱ��");
	}
	
	public void work(Integer id, String name) {	//name��������
		this.id = id;
		this.name = name;
		System.out.println("work����ִ��");
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//�Ѷ�������ݱ��һ���ַ������������Arrays.toString()
	
}
