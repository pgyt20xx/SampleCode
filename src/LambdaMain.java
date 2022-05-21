import lambda.Test;

public class LambdaMain {
	public static void main(String[] args) {
		Test test = new Test();
		test.process(() -> {
			System.out.println("Hello from lambda");
		});
	}
}
