package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
 
	private ReajusteService service;
	private Funcionario fun;
   
	
	
	@BeforeEach
	//Antes de Todos
	public void  inicializar() {
		service = new ReajusteService();
		fun = new Funcionario("Thiago Vasconcelos",LocalDate.now(),new BigDecimal("1000"));
	}
	
	@BeforeAll
	//Executa uma unica vez antes dos testes.
	public static void antesdeTodos() {
		System.out.println("Antes de todos");
	}
	
	@AfterAll
	//Executa uma unica vez depois dos testes.
	public static void depoisdeTodos() {
		System.out.println("Depois de todos");
	}
	
	
	@AfterEach
	//Depois de todos
	public void finalizar() {
		System.out.println("Fim");
	}
	
	@Test
	public void reajusteADesejar() {
		service.concederReajuste(fun,Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"),fun.getSalario());
		
		
		
		
	}
	
	@Test
	public void reajusteBom() {
    	service.concederReajuste(fun,Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"),fun.getSalario());
		
		
		
		
	}
	
	@Test
	public void reajusteOtimo() {
		service.concederReajuste(fun,Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"),fun.getSalario());
		
		
		
		
	}
	
	
	
}
