package br.com.design.patterns.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.design.patterns.CriadorDeOrcamento;
import br.com.design.patterns.Imposto;
import br.com.design.patterns.Orcamento;

public class TesteDeImpostos {

	private Orcamento orcamento;
	private CalculadorDeImpostos calculador;

	@Before
	public void criaReferencias() {
		this.orcamento = new CriadorDeOrcamento().valor(500.0).build();
		this.calculador = new CalculadorDeImpostos();
	}
	
	@Test
	public void calculoISS() {
		Imposto iss = new ISS();

		double calculoEsperadoISS = 30.0;
		
		// Calculando o ISS
		double calculoISS = calculador.realizaCalculo(orcamento, iss);
				
		System.out.println("calculoISS: " + calculoISS);

		Assert.assertEquals(calculoEsperadoISS, calculoISS, 0.00001);
	}
	
	@Test
	public void calculoICMS() {
		Imposto icms = new ICMS();

		double calculoEsperadoICMS = 50.0;
		
		// Calculando o ICMS
		double calculoICMS = calculador.realizaCalculo(orcamento, icms);
		
		System.out.println("calculoICMS: " + calculoICMS);
		
		Assert.assertEquals(calculoEsperadoICMS, calculoICMS, 0.00001);
	}
}
