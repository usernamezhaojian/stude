package javase.base;

public class TestMax {
	public static void main(String[] args) {
		
		int a = 78;
		int b = 88;
		int c = 60;
		
		c = 90;
		
		int t = (a>b)?a:b;
		int r = (t>c)?t:c;
		System.out.println(r);
	}
}
