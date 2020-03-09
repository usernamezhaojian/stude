package javase.base.inner;

public class TestFarmer {
	public static void main(String[] args) {
		Farmer f = new Farmer();
		f.plant(new Fruit() {
			
			@Override
			public void plant() {
				System.out.println("��ֲ" + this.getName());
			}
			
			@Override
			public String getName() {
				return "�ܲ�";
			}
		});
	}
}
