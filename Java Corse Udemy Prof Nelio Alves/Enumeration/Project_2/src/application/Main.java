package application;

import java.time.LocalDateTime;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o titulo do post:");
		String titlePost = sc.nextLine();

		System.out.println("Digite o conteúdo do post:");
		String contentPost = sc.nextLine();

		Post post = new Post(LocalDateTime.now(), titlePost, contentPost);

		char resp;

		do {
			System.err.print("Deseja fazer um comentário? (s/n): ");
			resp = sc.next().charAt(0);
			
			sc.nextLine();
			
			if (resp == 's') {
				System.out.println("Digite o commentário do post:");
				String commentPost = sc.nextLine();
		
				Comment comm = new Comment(commentPost);
				post.addComment(comm);
			}

		} while (resp != 'n');

		System.out.println(post);
		
		sc.close();

	}

}
