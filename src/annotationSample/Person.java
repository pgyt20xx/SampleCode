package annotationSample;

public class Person extends Item{
	
	// NotNullフィールド
	@NotNull(message="person's name is not null")
	private String name;

	public Person() {
		super();
	}
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
