package br.com.caelum.livraria.dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {

	@PersistenceContext
	private EntityManager entityManager;

	public Usuario buscaPeloLogin(String login) {
		Usuario usuario = null;
		usuario = (Usuario) this.entityManager.createQuery("select u from Usuario u where  u.login = :login")
				.setParameter("login", login).getSingleResult();
		return  usuario;
	}
	
}
