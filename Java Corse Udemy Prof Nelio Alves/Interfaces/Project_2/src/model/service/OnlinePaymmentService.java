package model.service;

public interface OnlinePaymmentService {
	 
	public double paymmentFee(double amount);
	public double interest(double amount, int months);
}
