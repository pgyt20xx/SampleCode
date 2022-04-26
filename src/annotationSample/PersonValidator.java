package annotationSample;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PersonValidator {
	
	/**
	 * @param バリデーションチェックするオブジェクト
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @retrun エラーメッセージ
	 */
	public static List<String> validate(Item target) throws IllegalArgumentException, IllegalAccessException{
		
		List<String> errors = new ArrayList<>();
		
		// 引数で渡されたオブジェクトのクラス情報を取得
		Class<Item> clazz = (Class<Item>) target.getClass();
		
		// クラス情報からフィールドを取得
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
			// フィールドを全てアクセス可能にする(privateにもアクセスできる)
			field.setAccessible(true);
			
			// フィールドからアノテーションを取得
			NotNull annotation = field.getAnnotation(NotNull.class);
			
			// アノテーションがない場合は次のフィールドへ
			if(annotation == null) {
				continue;
			}
			
			// fieldをtargetから取り出す
			if(field.get(target) != null) {
				continue;
			}
			
			// アノテーションのメッセージを取得
			String message = annotation.message();
			
			errors.add(message);
			
		}
		
		return errors;
	}

}
