package javase.base.ploy.feeder;

public class Cat implements Animal{

	@Override
	public void eat(Food food) {
		System.out.println("Сè��"+ food.getName());
	}

}
