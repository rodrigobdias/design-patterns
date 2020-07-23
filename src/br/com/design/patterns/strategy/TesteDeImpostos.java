package br.com.design.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

import br.com.design.patterns.Orcamento;

public class TesteDeImpostos {

	@Test
	public void main() {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		double calculoEsperadoISS = 30.0;
		double calculoEsperadoICMS = 75.0;
		
		// Calculando o ISS
		double calculoISS = calculador.realizaCalculo(orcamento, iss);
		
		// Calculando o ICMS
		double calculoICMS = calculador.realizaCalculo(orcamento, icms);
		
		Assert.assertEquals(calculoEsperadoISS, calculoISS, 0.00001);
		Assert.assertEquals(calculoEsperadoICMS, calculoICMS, 0.00001);
	}
}
