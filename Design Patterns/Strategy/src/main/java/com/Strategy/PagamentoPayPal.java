package com.Strategy;

public class PagamentoPayPal implements StrategyPaymment{

	@Override
	public void pagar(int valor) {
		 System.out.println("Pagamento de " + valor + " realizado com PayPal.");
		
	}

}
