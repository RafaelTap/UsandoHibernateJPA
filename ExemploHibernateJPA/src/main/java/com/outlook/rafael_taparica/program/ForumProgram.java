package com.outlook.rafael_taparica.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.outlook.rafael_taparica.helper.ForumHelper;

public class ForumProgram {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploHibernateJPA");
		EntityManager em = emf.createEntityManager();
		
	     ForumHelper forum = new ForumHelper(em);
	     
	     forum.criarForum("Hibernate", "Persistindo dados com Hibernate (JPA)");
		
		emf.close();
		em.close();
	}

}
