package Loops;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int sum = 0;
		
		while(valor != 0) {
			sum += valor;
			valor = sc.nextInt();
		}
		
		System.out.printf("O total somado é: %d", sum);
		sc.close();

	}

}
