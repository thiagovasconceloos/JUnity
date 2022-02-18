package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario fun, Desempenho desempenho) {
	    
	    	BigDecimal reajuste = fun.getSalario().multiply(desempenho.percentualReajuste());
	    	
	    	fun.reajustarSalario(reajuste); 
	      
	}

	
	
	
	
}
