package com.Builder;

public class App {
    public static void main(String[] args) {

    	Produto produto = Produto.Builder()
                .nome("Celular")
                .preco(999.99)
                .descricao("Celular com tela de 6.5 polegadas")
                .quantidade(5);

            System.out.println(produto);
    }
}
