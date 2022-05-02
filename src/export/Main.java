package export;

public class Main {
	public static void main(String[] args) {

		SampleCsv csv = new SampleCsv();
		csv.setColumnA("test");

		new ExportCsv().execute(csv);

	}
}
