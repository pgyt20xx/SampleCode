package interfaceSample;

public class FactoryS {
	public InterfaceA getInstance(String type) {
		switch (type) {
		case "A": {
			return new ClassA();
		}
		case "B": {
			return new ClassB();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
