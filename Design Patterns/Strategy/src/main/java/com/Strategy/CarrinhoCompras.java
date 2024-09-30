package com.Strategy;

public class CarrinhoCompras {
	
	private StrategyPaymment strategyPaymment;
	
	public void setEstrategiaPagamento(StrategyPaymment strategyPaymment) {
		this.strategyPaymment = strategyPaymment;
		
	}
	
	public void realizarPagamento(int valor) {
		strategyPaymment.pagar(valor);
	}
}
