package export;

import java.lang.reflect.Field;

public class ExportCsv {

	public void execute(SampleCsv csv) {

		try {
			Class clazz = csv.getClass();
			Field fields[] = clazz.getDeclaredFields();

			for (Field field : fields) {

				field.setAccessible(true);
				Column annotation = field.getAnnotation(Column.class);

				if (annotation == null) {
					continue;
				}

				String value = (String) field.get(csv);

				System.out.println(value);
			}

		} catch (Exception e) {

		}

	}

}
