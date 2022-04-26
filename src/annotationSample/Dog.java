package annotationSample;

public class Dog extends Item {
	
	// NotNullフィールド
	@NotNull(message="dog's name is not null")
	private String name;
	
	public Dog() {
		super();
	}

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
