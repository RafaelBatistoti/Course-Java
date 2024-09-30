package com.Factory_Method;

public class ExcelReport implements Report{

	@Override
	public void generate() {
		System.out.println("Generating Excel report...");
		
	}

}
