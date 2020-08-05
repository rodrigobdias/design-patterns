package br.com.design.patterns.state;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.design.patterns.CriadorDeOrcamento;
import br.com.design.patterns.Orcamento;

public class TesteDeDescontoExtra {

	
	private Orcamento reforma;

	@Before
	public void criaReferencias() {
		this.reforma = new CriadorDeOrcamento().valor(500.0).build();
	}
	
	@Test
	public void descontoExtraAprovaNoEstadoInicialEmAprovacao() {
		
		double calculoEsperadoDescontoExtraNoEstadoEmAprovacao = 475.0;
		double calculoEsperadoDescontoExtraNoEstadoAprova = 465.5;
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		Assert.assertEquals(calculoEsperadoDescontoExtraNoEstadoEmAprovacao, reforma.getValor(), 0.00001);
		

		reforma.aprova();
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		Assert.assertEquals(calculoEsperadoDescontoExtraNoEstadoAprova, reforma.getValor(), 0.00001);
		
		
				
	}
	
	@Test(expected = RuntimeException.class)
	public void descontoExtraFinalizaNoEstadoInicialEmAprovacao() {
					
		reforma.finaliza(); 
		reforma.aplicaDescontoExtra(); /// Deve lançar RuntimeException
			
	}	
}
