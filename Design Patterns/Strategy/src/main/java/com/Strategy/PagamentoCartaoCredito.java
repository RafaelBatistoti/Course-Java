package com.Strategy;

public class PagamentoCartaoCredito implements StrategyPaymment{

	@Override
	public void pagar(int valor) {
		 System.out.println("Pagamento de " + valor + " realizado com cartão de crédito.");
	}

}
