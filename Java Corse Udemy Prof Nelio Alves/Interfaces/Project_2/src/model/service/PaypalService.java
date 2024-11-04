package model.service;

public class PaypalService implements OnlinePaymmentService{

	@Override
	public double paymmentFee(double amount) {
		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * 0.01 * months;
	}

}
