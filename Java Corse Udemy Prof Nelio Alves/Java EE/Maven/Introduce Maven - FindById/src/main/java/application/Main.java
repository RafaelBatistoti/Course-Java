package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager        em  = emf.createEntityManager();

		Pessoa pessoa = em.find(Pessoa.class, 5);

		System.out.println(pessoa);

		emf.close();
		em.close();
	}

}
