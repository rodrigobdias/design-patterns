package br.com.design.patterns.chain_of_responsibility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.design.patterns.CriadorDeOrcamento;
import br.com.design.patterns.Orcamento;

public class TesteDeDescontos {

	private CalculadorDeDescontos descontos;

	@Before
	public void criaDescontos() {
		this.descontos = new CalculadorDeDescontos();
	}

	@Test
	public void calculoDescontoPorCincoItens() {
		
		Orcamento orcamento = new CriadorDeOrcamento().valor(500.0)
				.item("CANETA", 250.0)
				.item("LAPIS", 250.0)
				.item("BORRACHA", 50.0)
				.item("APONTADOR", 25.0)
				.item("CADERNO", 250.0)
				.item("REGUA", 200.0)
				.build();
		
		double calculoEsperadoDescontoPorCincoItens = 50.0;

		// Calculando DescontoPorCincoItens
		double descontoPorCincoItens = descontos.calcula(orcamento);

		System.out.println("DescontoPorCincoItens: " + descontoPorCincoItens);

		Assert.assertEquals(calculoEsperadoDescontoPorCincoItens, descontoPorCincoItens, 0.00000000000001);

	}

	@Test
	public void calculoDescontoPorMaisDeQuinhentosReais() {

		Orcamento orcamento = new CriadorDeOrcamento().valor(800.0)
				.item("CANETA", 250.0)
				.item("LAPIS", 250.0)
				.build();
		
		double calculoEsperadoDescontoPorMaisDeQuinhentosReais = 56.0;

		// Calculando DescontoPorMaisDeQuinhentosReais
		double descontoPorMaisDeQuinhentosReais = descontos.calcula(orcamento);

		System.out.println("DescontoPorMaisDeQuinhentosReais: " + descontoPorMaisDeQuinhentosReais);

		Assert.assertEquals(calculoEsperadoDescontoPorMaisDeQuinhentosReais, descontoPorMaisDeQuinhentosReais,
				0.00000000000001);

	}

	@Test
	public void calculoSemDesconto() {

		Orcamento orcamento = new CriadorDeOrcamento().valor(400.0)
				.item("CANETA", 250.0)
				.item("LAPIS", 250.0)
				.build();
		
		double calculoEsperadoSemDesconto = 0.0;

		// calculando SemDesconto
		double semDesconto = descontos.calcula(orcamento);

		System.out.println("SemDesconto: " + semDesconto);

		Assert.assertEquals(calculoEsperadoSemDesconto, semDesconto, 0.00000000000001);
	}

}
