package interfaceSample;

public interface InterfaceA {
	public static InterfaceA createA() {
		return new ClassA();
	}
	public static InterfaceA createB() {
		return new ClassB();
	}
	public void test();
}
