package javase.base.ploy.car;

public class TestCar {
	public static void main(String[] args) {
		SellCar sellCar = new SellCar();
		Car car;
		//�ڲ�������ϵ��̬����ͬ��ʽ������ʱ��֪����Ҳ��Ϊ��̬��
		
		car = new BMW();
		sellCar.sell(car);
		
		car = new HG();
		sellCar.sell(car);
		
		car = new BMW();
		sellCar.sell(car);
		
		Integer money = sellCar.getMoney();
		System.out.println(String.format("\n�ܵ����۶%s", money));
	}
}
