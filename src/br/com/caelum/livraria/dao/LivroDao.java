package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void salva(Livro livro) {
		entityManager.persist(livro);
		;
	}

	public List<Livro> todosLivros() {
		return entityManager.createQuery("select l from Livro l", Livro.class).getResultList();
	}

	public List<Livro> obterLivrosPeloTitulo(String titulo) {

		List<Livro> listaDeLivros = entityManager
				.createQuery("select l from Livro l where l.titulo like :titulo", Livro.class)
				.setParameter("titulo", "%" + titulo + "%").getResultList();

		return listaDeLivros;
	}

}
