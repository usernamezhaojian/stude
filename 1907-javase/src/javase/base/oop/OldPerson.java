package javase.base.oop;

//�ڸ��ӱ����У���������ı���Ҫ�ð�װ����
public class OldPerson {
	//������Ա����Щ����
	//���
	//���η������η�Χ��public���ã�private˽��
	private Integer id = 100;		//��Ա������Ҳ��Ϊfield ����

	//�������ã����غͳ�Ա������ͬ����
	public Integer getId() {		//java�����շ����
		System.out.println("id���˷����ˣ�"+id);
		return id;
	}
	//�������ã�����ֵvoid���շ����(����)
	public void setId(Integer id) {	//����id���ǳ�Ա����
		//������id����Ա����Ҳ��id��id=id
		//����������ͬ��Ϊ�����ֱ������Ʒ�����˭��java���this�ؼ���
		//this����������
		
		if(id==1) {
			System.out.println("�����෢Ǯ");
		}
		this.id = id;	//ǰ���ǳ�Ա�����������ǲ���
	}
	
	//�������ܻ�ȡ���ֵ�������Ҳ�����ı䣡
	private String name = "tony";
	public String getName() {
		return name;
	}

	//�Ա�
	private Boolean sex;		//��true��Ůfalse
	
	//����
	public Integer age;
	
	//���ڹ�˾
	public String company;


	
	//����getter����ȡ����setter�����ã�����
	//IDE eclipse �Զ�����getter��setter����
	
}





