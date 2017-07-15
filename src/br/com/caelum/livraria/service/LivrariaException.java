package br.com.caelum.livraria.service;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class LivrariaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public LivrariaException(){
		super();
	}
	public LivrariaException(String mensagem){
		super(mensagem);
	}
}
