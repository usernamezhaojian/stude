package javase.base.ploy.car;

public class SellCar {
	//�ۼӣ���Ա����
	private Integer money = 0;
	
	//����
	public void sell(Car car) {
		//%sռλ�������������������ݣ���Ҫ���滻
		String s = String.format("�ͺţ�%s , �۸�%s", 
				car.getName(), car.getPrice());
		
		System.out.println(s);
		
		money += car.getPrice();
	}
	
	//�����ܶ�
	public Integer getMoney() {
		return this.money;
	}
}
