package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.*;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
 
	@Test
	public void reajusteADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario fun = new Funcionario("Thiago Vasconcelos",LocalDate.now(),new BigDecimal("1000"));
		
		service.concederReajuste(fun,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),fun.getSalario());
		
		
		
		
	}
	
	@Test
	public void reajusteBom() {
		ReajusteService service = new ReajusteService();
		Funcionario fun = new Funcionario("Alexandre Vasconcelos",LocalDate.now(),new BigDecimal("1000"));
		
		service.concederReajuste(fun,Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"),fun.getSalario());
		
		
		
		
	}
	
	@Test
	public void reajusteOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario fun = new Funcionario("Leonardo Vasconcelos",LocalDate.now(),new BigDecimal("1000"));
		
		service.concederReajuste(fun,Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"),fun.getSalario());
		
		
		
		
	}
	
	
	
}
