package lambda;

import java.util.function.Consumer;

public class Item {
	private String id;
	private String name;
	private String description;
	private int price;
	
	
	public Item id(String id) {
		this.id = id;
		return this;
	}
	public Item name(String name) {
		this.name = name;
		return this;
	}
	public Item description(String description) {
		this.description = description;
		return this;
	}
	public Item price(int price) {
		this.price = price;
		return this;
	}
	
	public static void save(Consumer<Item> con) {
		Item item = new Item();
		con.accept(item);
		
		System.out.println("save:" + item);
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
}
