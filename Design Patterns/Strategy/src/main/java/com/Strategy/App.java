package com.Strategy;

public class App {
    public static void main(String[] args) {

    	CarrinhoCompras card = new CarrinhoCompras();
    	
    	card.setEstrategiaPagamento(new PagamentoCartaoCredito());
    	card.realizarPagamento(100);
    	
    	card.setEstrategiaPagamento(new PagamentoPayPal());
    	card.realizarPagamento(250);
    }
}
