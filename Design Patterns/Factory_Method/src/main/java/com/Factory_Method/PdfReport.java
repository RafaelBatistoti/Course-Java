package com.Factory_Method;

public class PdfReport implements Report {

	@Override
	public void generate() {
		System.out.println("Generating PDF report...");

	}

}
