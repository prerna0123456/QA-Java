package classes.interfaces;

public class PDFReport implements Report {

	@Override
	public void generateReport(String str) {
		System.out.println("Creating reports in PDF format");
	}

}
