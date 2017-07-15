package br.com.caelum.livraria.interceptador;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptador {

	@AroundInvoke
	public Object intercepta(InvocationContext invocationContext) throws Exception {

		long millis = System.currentTimeMillis();
		String metodo = invocationContext.getMethod().getName();
		String nomeClasse = invocationContext.getTarget().getClass().getSimpleName();
		Object object = invocationContext.proceed();
		System.out.println(nomeClasse + ", " + metodo);
		System.out.println("Tempo gasto:  " + (System.currentTimeMillis() - millis));
		
		return object;
	}
}
