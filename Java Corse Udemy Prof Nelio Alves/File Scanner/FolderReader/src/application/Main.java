package application;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.next();
		
		File path = new File(strPath);
		
//		Interage sob todas as pastas
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
//		Interage sob todos os arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
//		Criando uma pasta no diretório informado
		boolean success = new File(strPath + "\\Nova Pasta").mkdir();
		System.out.println("Pasta criada com sucesso " + success);
		
		sc.close();

	}

}
