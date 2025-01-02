package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa(null, "Generico", "generico@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager        em  = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();

		System.out.println("Done!");
	}

}
