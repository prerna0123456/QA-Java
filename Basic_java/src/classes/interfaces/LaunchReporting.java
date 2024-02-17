package classes.interfaces;

import java.util.Scanner;

public class LaunchReporting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of report");
		String reportType=sc.nextLine();
		
		createReport(reportType.toUpperCase());
		
		
	}
	
	static void createReport(String reportType) {
		
		Report rep=null;
		
		switch(reportType) {
		case "PDF":
			rep= new PDFReport();
			rep.generateReport(reportType);
			break;
		case "HTML":
			rep = new HTMLReports();
			rep.generateReport(reportType);
			break;
		default:
			System.out.println("Enter only PDF or HTML as report type");
		}
		
	}

}
