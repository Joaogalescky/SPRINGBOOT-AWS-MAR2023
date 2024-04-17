package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/* Dados a inserir
		Pessoa p1 = new Pessoa(null, "Matheus Augusto", "mathuesaugusto@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joana Campelli", "joanacampelli@gmail.com");
		Pessoa p3 = new Pessoa(null, "Gabriel Schmitt", "gabrielschmitt@gmail.com");
		*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager(); // Conexão com o BD
		
		//Pessoa p = em.find(Pessoa.class, 2); // Visualizar um dado
		
		Pessoa p = em.find(Pessoa.class, 2); // Buscar o objeto
		em.getTransaction().begin(); // Iniciar uma transação para remover
		em.remove(p); // Removendo o objeto
		em.getTransaction().commit(); // Confirmar a remoção
		
		/* Para salvar no BD
		em.getTransaction().begin(); // Iniciar uma transação
		em.persist(p1); // Pega o obj e salva no BD
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); // Confirmar as transações feitas
		*/
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
