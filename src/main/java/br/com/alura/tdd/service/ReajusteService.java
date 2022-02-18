package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario fun, Desempenho desempenho) {
	    if(desempenho==Desempenho.A_DESEJAR) {
	    	BigDecimal reajuste = fun.getSalario().multiply(new BigDecimal("0.03"));
	    	fun.reajustarSalario(reajuste); 
	       
	    	
	    }
		
	    if(desempenho==Desempenho.BOM) {
	    	BigDecimal reajuste = fun.getSalario().multiply(new BigDecimal("0.15"));
	    	fun.reajustarSalario(reajuste); 
	       
	    	
	    }
	    
	    if(desempenho==Desempenho.OTIMO) {
	    	BigDecimal reajuste = fun.getSalario().multiply(new BigDecimal("0.20"));
	    	fun.reajustarSalario(reajuste); 
	       
	    	
	    }
		
		
		
	}

	
	
	
	
}
