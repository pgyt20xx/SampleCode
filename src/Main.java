import interfaceSample.InterfaceA;

public class Main {
	public static void main(String[] args) {
		InterfaceA a = InterfaceA.createA();
		a.test();
		
		InterfaceA b = InterfaceA.createB();
		b.test();
	}
}
