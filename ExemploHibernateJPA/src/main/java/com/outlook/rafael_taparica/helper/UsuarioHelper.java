package com.outlook.rafael_taparica.helper;

import javax.persistence.EntityManager;

import com.outlook.rafael_taparica.entity.Forum;
import com.outlook.rafael_taparica.entity.Usuario;

public class UsuarioHelper {

	EntityManager em;

	public UsuarioHelper(EntityManager em) {
		this.em = em;
	}

	public String adicionarUsuario(int idForum, Usuario usuario) {

		try {
			Forum f = em.find(Forum.class, idForum);
			usuario.setForum(f);
			f.getUsuarios().add(usuario);

			em.getTransaction().begin();
			em.persist(f);
			em.getTransaction().commit();

			return "Inclusão realizada";

		} catch (Exception e) {

			return e.getMessage();
		}

	}

}
