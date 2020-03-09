package javase.base.exception;

public class TestFinally {
	public static void main(String[] args) {
		try {	//try里面的代码必须执行
			String name = "tony";
			int i = 3/0;	//抛出异常
		} catch(Exception e) {	//只有出现异常才执行
			System.out.println(e.getMessage());
		} finally {	//死活都执行，对复杂对象释放资源
			System.out.println("看我执行了吗？");
		}
	}
}
