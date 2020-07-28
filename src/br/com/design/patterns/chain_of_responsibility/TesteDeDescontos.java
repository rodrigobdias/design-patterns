package br.com.design.patterns.chain_of_responsibility;

import org.junit.Assert;
import org.junit.Test;

import br.com.design.patterns.Orcamento;

public class TesteDeDescontos {
	
	@Test
	public void main() {
		
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento1 = new Orcamento(500.0);
		orcamento1.adicionaItem(new Item("CANETA", 250.0));
		orcamento1.adicionaItem(new Item("LAPIS", 250.0));
		orcamento1.adicionaItem(new Item("BORRACHA", 50.0));
		orcamento1.adicionaItem(new Item("APONTADOR", 25.0));
		orcamento1.adicionaItem(new Item("CADERNO", 250.0));
		orcamento1.adicionaItem(new Item("REGUA", 200.0));
		
		Orcamento orcamento2 = new Orcamento(800.0);
		orcamento2.adicionaItem(new Item("CANETA", 250.0));
		orcamento2.adicionaItem(new Item("LAPIS", 250.0));
		
		Orcamento orcamento3 = new Orcamento(400.0);
		orcamento3.adicionaItem(new Item("CANETA", 250.0));
		orcamento3.adicionaItem(new Item("LAPIS", 250.0));
				
		double calculoEsperadoDescontoPorCincoItens = 50.0;
		double calculoEsperadoDescontoPorMaisDeQuinhentosReais = 56.0;
		double calculoEsperadoSemDesconto = 0.0;
		
		// Calculando DescontoPorCincoItens
		double descontoPorCincoItens = descontos.calcula(orcamento1);
		
		// Calculando DescontoPorMaisDeQuinhentosReais
		double descontoPorMaisDeQuinhentosReais = descontos.calcula(orcamento2);
		
		// Calculando SemDesconto
		double semDesconto = descontos.calcula(orcamento3);
		
		System.out.println("DescontoPorCincoItens: " + descontoPorCincoItens);
		System.out.println("DescontoPorMaisDeQuinhentosReais: " + descontoPorMaisDeQuinhentosReais);
		System.out.println("SemDesconto: " + semDesconto);
		
		Assert.assertEquals(calculoEsperadoDescontoPorCincoItens, descontoPorCincoItens, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoDescontoPorMaisDeQuinhentosReais, descontoPorMaisDeQuinhentosReais, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoSemDesconto, semDesconto, 0.00000000000001);
		
	}
}
