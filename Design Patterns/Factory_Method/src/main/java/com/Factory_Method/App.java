package com.Factory_Method;

public class App {
	public static void main(String[] args) {

		Report pdfReport = ReportFactory.createReport("PDF");
		pdfReport.generate();
		
		Report excelReport = ReportFactory.createReport("Excel");
		excelReport.generate();
	}
}