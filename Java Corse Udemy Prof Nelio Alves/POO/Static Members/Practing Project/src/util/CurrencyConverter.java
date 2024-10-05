package util;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double getPercentage(double real, double dolarPrice) {
		return real * dolarPrice * (IOF /100);
	}
	
	public static double conversor(double percent, double real, double dolarPrice) {
		return real * dolarPrice + percent;
	}
	
}
