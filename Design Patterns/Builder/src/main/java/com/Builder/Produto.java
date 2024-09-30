package com.Builder;

public class Produto {

	private String nome;
    private double preco;
    private String descricao;
    private int quantidade;

	private Produto() {}

	public static Produto Builder() {
		return new Produto();
	}

	public Produto nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Produto preco(double preco) {
        this.preco = preco;
        return this;
    }

    public Produto descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Produto quantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", descricao=" + descricao + ", quantidade=" + quantidade
				+ "]";
	}




}
