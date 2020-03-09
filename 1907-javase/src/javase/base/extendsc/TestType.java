package javase.base.extendsc;

//��ӡ���ְ�װ���͵ĸ���
public class TestType {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//��������
		Boolean b = new Boolean(true);
		System.out.println(b);
		System.out.println(b.getClass().getSuperclass());
		
		//�ַ�����
		Character c = new Character('a');
		System.out.println(c);	//97
		System.out.println(c.getClass().getSuperclass());
		
		//��ֵ����
		byte by = 0;
		Byte bt = new Byte( by );
		System.out.println( bt.getClass().getSuperclass() );
		System.out.println( bt.getClass().getSuperclass().getSuperclass() );
		
		//ǿ��ת��
		Short s = new Short( (short) 0 );
		System.out.println(s.getClass().getSuperclass());
		
		Integer i = new Integer(0);
		System.out.println(s.getClass().getSuperclass());
		
		Long l = new Long(0);
		System.out.println(s.getClass().getSuperclass());
		
		//������
		Float f = new Float(0.0);
		System.out.println(f.getClass().getSuperclass());
		System.out.println(f.getClass().getSuperclass().getSuperclass());
		
		Double d = new Double(0.0);
		System.out.println(f.getClass().getSuperclass());
		System.out.println(f.getClass().getSuperclass().getSuperclass());
	}
}



