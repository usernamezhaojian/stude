package javase.base.ploy.feeder;

public class TestFeed {
	public static void main(String[] args) {
		Feeder f = new Feeder();
		Animal animal;
		Food food;
		
		//��Сè��С��
		food = new Fish("С����");
		animal = new Cat();
		
		f.feed(animal, food);
		
		//��С����׷�
		food = new Rice("���׷�");
		animal = new Pig();
		
		f.feed(animal, food);
	}
}
