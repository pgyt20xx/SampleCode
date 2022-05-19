import lambda.Factory;
import lambda.Sample;

public class Main {
	public static void main(String[] args) {
		Sample sample = Factory.create();
		sample.execute();
	}
}
