package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.modelo.Livro;
import br.com.caelum.livraria.service.LivroService;

@WebService
@Stateless
public class LivrariaWebService {

	@Inject
	LivroService livroService;
	
	public @WebResult(name="livros") List<Livro> obterLivrosPeloTitulo(@WebParam(name="titulo")String titulo) {

	        System.out.println("LivrariaWS: procurando pelo titulo " + titulo);
	   
	        return livroService.obterLivrosPeloTitulo(titulo);
	   }
}
