package com.Factory_Method;

/*
 * 	Method 1
 *
	public abstract class ReportFactory {
		public abstract Report createReport();
	}
*/

class ReportFactory {
	public static Report createReport(String type) {
		if (type.equalsIgnoreCase("PDF")) {
			return new PdfReport();
		} else if (type.equalsIgnoreCase("Excel")) {
			return new ExcelReport();
		}
		throw new IllegalArgumentException("Unknown report type: " + type);
	}
}
