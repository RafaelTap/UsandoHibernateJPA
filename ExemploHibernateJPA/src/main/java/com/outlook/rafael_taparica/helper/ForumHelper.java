package com.outlook.rafael_taparica.helper;

import javax.persistence.EntityManager;

import com.outlook.rafael_taparica.entity.Forum;

public class ForumHelper {

	EntityManager em;

	public ForumHelper(EntityManager em) {
		this.em = em;
	}

	public void criarForum(String assunto, String descricao) {

		Forum forum = new Forum();
		forum.setAssunto(assunto);
		forum.setDescricao(descricao);

		em.getTransaction().begin();
		em.persist(forum);
		em.getTransaction().commit();
		
		salvarForum(forum);

		
	}
	
	public String salvarForum (Forum forum) {
		
		em.getTransaction().begin();
		em.persist(forum);
		em.getTransaction().commit();
		
		return "fórum adicionado.";
		
	}

}
