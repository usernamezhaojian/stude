package javase.base.branch;

//if��֧���ԣ�������Ů
public class TestIf {
	//�жϣ�������У���ӡ����Ǯ���������Ů����ӡ����Ǯ��
	public static void main(String[] args) {
//����ѡ�У���ݼ�Ctrl+/		
//		//�������ʽ��ҪôΪtrue��ҪôΪfalse
//		String sex = "woman";
//		
//		//equals�Ƚϣ�sex�����������е����ݽ��бȽ�
//		System.out.println("�����Ƿ������"+sex.equals("man"));
//		//�������ʽ�������2����Ҫô��������true��Ҫô����������false
//		if(sex.equals("man")) {
//			//�� Y
//			System.out.println("��Ǯ");
// 		}else {
//			//�� N
// 			System.out.println("��Ǯ");
//		}
		
		
//		int score = 60;
//		//�ж����������ڵ���90��
//		if(score>=90) {
//			System.out.println("�ŵ�");
//		}else {
//			//С��90��
//			System.out.println("һ��");
//		}
		
		/*
		 * 
60������		������
60~70		����
71~80		�еȣ�
81~90		���ã�
91~100		����
		 */

		int s = 99;
		String rtn = "";	//���ַ�����������Ϣ
		
		if (s<60) {
			rtn = "������";
		} else if(s>=60 && s<=70){	//��������
			rtn = "����";
		} else if(s>70 && s<=80) {
			rtn = "�е�";
		} else if(s>80 && s<=90) {
			rtn = "����";
		} else {
			rtn = "����";
		}
		System.out.println(rtn);
		
	}
}





