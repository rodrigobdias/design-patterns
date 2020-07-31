package br.com.design.patterns.decorator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.design.patterns.Imposto;
import br.com.design.patterns.Orcamento;
import br.com.design.patterns.strategy.ICMS;
import br.com.design.patterns.strategy.ISS;

public class TesteDeImpostosComplexos {

	
	private Orcamento orcamento;

	@Before
	public void criaDescontos() {
		this.orcamento = new Orcamento(500.0);
	}
	
	@Test
	public void calculoISS() {
		Imposto iss = new ISS();

		double calculoEsperadoISS = 30.0;

		// Calculando ISS
		double impostoISS = iss.calcula(orcamento);

		System.out.println("impostoISS: " + impostoISS);

		Assert.assertEquals(calculoEsperadoISS, impostoISS, 0.00000000000001);

	}

	@Test
	public void calculoISSAndICMS() {
		Imposto issIcms = new ISS(new ICMS());

		double calculoEsperadoISSAndICMS = 80.0;

		// Calculando ISS(ICMS)
		double impostoISSAndICMS = issIcms.calcula(orcamento);

		System.out.println("impostoISSAndICMS: " + impostoISSAndICMS);

		Assert.assertEquals(calculoEsperadoISSAndICMS, impostoISSAndICMS, 0.00000000000001);

	}

	@Test
	public void calculoICMS() {
		Imposto icms = new ICMS();

		double calculoEsperadoICMS = 50.0;

		// Calculando ICMS
		double impostoICMS = icms.calcula(orcamento);

		System.out.println("impostoICMS: " + impostoICMS);

		Assert.assertEquals(calculoEsperadoICMS, impostoICMS, 0.00000000000001);

	}

	@Test
	public void calculoICMSAndISS() {
		Imposto icmsISS = new ICMS(new ISS());

		double calculoEsperadoICMSAndISS = 80.0;

		// Calculando ICMS(ISS)
		double impostoICMSAndISS = icmsISS.calcula(orcamento);

		System.out.println("impostoICMSAndISS: " + impostoICMSAndISS);

		Assert.assertEquals(calculoEsperadoICMSAndISS, impostoICMSAndISS, 0.00000000000001);
	}

}
