package exception;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.hello();
		} catch (TestException e) {
			System.out.println(e.getMessage());
			System.out.println("トラブル発生");
		}
	}
}
