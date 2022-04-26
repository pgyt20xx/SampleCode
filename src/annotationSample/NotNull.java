package annotationSample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 実行時まで保持するアノテーション
@Retention(RetentionPolicy.RUNTIME)

// アノテーションの適用範囲
@Target(ElementType.FIELD)

// interface宣言の前に@付与することでアノテーションを作成
public @interface NotNull {
	// アノテーションのパラメータを定義
	String message();
}
