package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymmentService onlinePaymmentService;

	public ContractService(OnlinePaymmentService onlinePaymmentService) {
		this.onlinePaymmentService = onlinePaymmentService;
	}

	public void processingContract(Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate duoDate = contract.getDate().plusMonths(i);

			double interest = onlinePaymmentService.interest(basicQuota, i);
			double fee      = onlinePaymmentService.paymmentFee(basicQuota + interest);
			double quota    = basicQuota + interest + fee;
			
			contract.getInstallmentList().add(new Installment(duoDate, quota));

		}

	}

}
