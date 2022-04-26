package exception;

public class A {
	public void hello() throws TestException {
		B b = new B();
		try {
			b.hello();
		} catch (SampleException e) {
			throw new TestException("Test");
		}
		
	}

}
