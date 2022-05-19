package lambda;

public class Factory {
	public static Sample create() {
		return new Factory().new InnerSample();
	}
	
	private class InnerSample implements Sample {

		@Override
		public void execute() {
			System.out.println("Inner Class");
		}
	}
}
