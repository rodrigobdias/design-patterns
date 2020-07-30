package br.com.design.patterns.decorator;

import org.junit.Assert;
import org.junit.Test;

import br.com.design.patterns.Imposto;
import br.com.design.patterns.Orcamento;
import br.com.design.patterns.strategy.ICMS;
import br.com.design.patterns.strategy.ISS;

public class TesteDeImpostosComplexos {

	@Test
	public void main() {
		Imposto iss = new ISS();
		Imposto issIcms = new ISS(new ICMS());
		Imposto icms = new ICMS();
		Imposto icmsISS = new ICMS(new ISS());
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double calculoEsperadoISS = 30.0;
		double calculoEsperadoISSAndICMS = 80.0;
		double calculoEsperadoICMS = 50.0;
		double calculoEsperadoICMSAndISS = 80.0;
		
		// Calculando ISS
		double impostoISS = iss.calcula(orcamento);
		
		// Calculando ISS(ICMS)
		double impostoISSAndICMS = issIcms.calcula(orcamento);
		
		// Calculando ICMS
		double impostoICMS = icms.calcula(orcamento);
		
		// Calculando ICMS(ISS)
		double impostoICMSAndISS = icmsISS.calcula(orcamento);
				
		System.out.println("impostoISS: " + impostoISS);
		System.out.println("impostoISSAndICMS: " + impostoISSAndICMS);
		System.out.println("impostoICMS: " + impostoICMS);
		System.out.println("impostoICMSAndISS: " + impostoICMSAndISS);
		
		Assert.assertEquals(calculoEsperadoISS, impostoISS, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoISSAndICMS, impostoISSAndICMS, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoICMS, impostoICMS, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoICMSAndISS, impostoICMSAndISS, 0.00000000000001);
	}
}
