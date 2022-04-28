import interfaceSample.FactoryS;
import interfaceSample.InterfaceA;

public class FactoryMethodMain {
	public static void main(String[] args) {
		InterfaceA x = null;
		
		x = new FactoryS().getInstance("A");
		x.test();
		
		x = new FactoryS().getInstance("B");
		x.test();
		
	}
}
