import lambda.Item;

public class LambdaItemMain {
	public static void main(String[] args) {
		// メソッドチェーンによる値設定
		Item.save(item -> {
			item.id("A100")
			.name("AX100G")
			.description("sample")
			.price(1000 );
		});
		

	}
}
