package com.Prototype;

public class App {
	public static void main(String[] args) {
		try {
			Produto	produtoOriginal	= new Produto("Celular", 1500.0);
			Produto	produtoClone	= produtoOriginal.clone();

			System.out.println("Produto Original: " + produtoOriginal);
			System.out.println("Produto Clonado: " + produtoClone);
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
