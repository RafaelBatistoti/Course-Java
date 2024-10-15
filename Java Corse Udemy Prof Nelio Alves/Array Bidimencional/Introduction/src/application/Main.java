package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] mat = new int[n][n];

//			Loop que percorre as linhas
		for (int i = 0; i < mat.length; i++) {
//			Loop que percorre as colunas
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		int conta = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0)
					conta ++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidades de números negativos são");
		System.out.println(conta);
		
		sc.close();

	}

}
