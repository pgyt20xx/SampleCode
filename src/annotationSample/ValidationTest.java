package annotationSample;

import java.util.List;

public class ValidationTest {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		Person p = new Person(null);
		check(p);
		
		Dog d = new Dog(null);
		check(d);
		
	}
	
	
	public static void check(Item i) throws IllegalArgumentException, IllegalAccessException {
		List<String> errors = PersonValidator.validate(i);
		if(errors.isEmpty()) {
			return;
		}
		
		for (String message : errors) {
			System.out.println(message);
		}
	}
}
