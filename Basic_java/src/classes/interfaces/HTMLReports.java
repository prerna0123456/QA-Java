package classes.interfaces;

public class HTMLReports implements Report {

	@Override
	public void generateReport(String str) {
		System.out.println("Creating reports in HTML format");
	}

}
