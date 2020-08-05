package br.com.design.patterns.template_method;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.design.patterns.CriadorDeOrcamento;
import br.com.design.patterns.Orcamento;

public class TesteDeImpostoCondicional {

	
	private ICPP icpp;
	private IKCV ikcv;

	@Before
	public void criaDescontos() {
		this.icpp = new ICPP();
		this.ikcv = new IKCV();
	}
	
	@Test
	public void testeICPPMinimaTaxacao() {

		Orcamento orcamento = new CriadorDeOrcamento().valor(500.0)
				.item("CANETA", 250.0)
				.item("LAPIS", 250.0)
				.build();

		double calculoEsperadoICPPMinimaTaxacao = 25.0;

		// Calculando ICPPMinimaTaxacao
		double impostoICPPMinimaTaxacao = icpp.calcula(orcamento);

		System.out.println("impostoICPPMinimaTaxacao: " + impostoICPPMinimaTaxacao);

		Assert.assertEquals(calculoEsperadoICPPMinimaTaxacao, impostoICPPMinimaTaxacao, 0.00000000000001);
	}

	@Test
	public void testeICPPMaximaTaxacao() {

		Orcamento orcamento = new CriadorDeOrcamento().valor(800.0)
				.item("CANETA", 250.0)
				.item("LAPIS", 250.0)
				.build();

		double calculoEsperadoICPPMaximaTaxacao = 56.0;

		// Calculando ICPPMaximaTaxacao
		double impostoICPPMaximaTaxacao = icpp.calcula(orcamento);

		System.out.println("impostoICPPMaximaTaxacao: " + impostoICPPMaximaTaxacao);

		Assert.assertEquals(calculoEsperadoICPPMaximaTaxacao, impostoICPPMaximaTaxacao, 0.00000000000001);
	}

	@Test
	public void testeIKCVMinimaTaxacao() {

		Orcamento orcamento = new CriadorDeOrcamento().valor(100.0)
				.item("CANETA", 20.0)
				.item("LAPIS", 200.0)
				.build();

		double calculoEsperadoIKCVMinimaTaxacao = 6.0;

		// Calculando IKCVMinimaTaxacao
		double impostoIKCVMinimaTaxacao = ikcv.calcula(orcamento);

		System.out.println("impostoIKCVMinimaTaxacao: " + impostoIKCVMinimaTaxacao);

		Assert.assertEquals(calculoEsperadoIKCVMinimaTaxacao, impostoIKCVMinimaTaxacao, 0.00000000000001);
	}

	@Test
	public void testeIKCVMaximaTaxacao() {

		Orcamento orcamento = new CriadorDeOrcamento().valor(1000.0)
				.item("CANETA", 20.0)
				.item("LAPIS", 200.0)
				.build();
		
		double calculoEsperadoIKCVMaximaTaxacao = 100.0;

		// Calculando IKCVMaximaTaxacao
		double impostoIKCVMaximaTaxacao = ikcv.calcula(orcamento);

		System.out.println("impostoIKCVMaximaTaxacao: " + impostoIKCVMaximaTaxacao);

		Assert.assertEquals(calculoEsperadoIKCVMaximaTaxacao, impostoIKCVMaximaTaxacao, 0.00000000000001);
	}
}
