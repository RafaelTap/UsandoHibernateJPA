package entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploHibernateJPA");
		EntityManager em = emf.createEntityManager();

		ForumHelper dao = new ForumHelper(em);

		Forum forum = new Forum();
		forum.setAssunto("JPA");
		forum.setDescricao("Java Persistence API");

		System.out.println(dao.salvar(forum));

		Usuario usuario = new Usuario();
		usuario.setNome("Joaquim");
		usuario.setEmail("joaquim@ead.com.br");
		System.out.println(dao.adicionarUsuario(forum.getId(), usuario));
	}

}
