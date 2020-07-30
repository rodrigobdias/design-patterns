package br.com.design.patterns.template_method;

import org.junit.Assert;
import org.junit.Test;

import br.com.design.patterns.Item;
import br.com.design.patterns.Orcamento;

public class TesteDeImpostoCondicional {

	@Test
	public void main() {
		
		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		
		Orcamento orcamento1 = new Orcamento(500.0);
		orcamento1.adicionaItem(new Item("CANETA", 250.0));
		orcamento1.adicionaItem(new Item("LAPIS", 250.0));
		
		Orcamento orcamento2 = new Orcamento(800.0);
		orcamento2.adicionaItem(new Item("CANETA", 250.0));
		orcamento2.adicionaItem(new Item("LAPIS", 250.0));
		
		Orcamento orcamento3 = new Orcamento(100.0);
		orcamento3.adicionaItem(new Item("CANETA", 20.0));
		orcamento3.adicionaItem(new Item("LAPIS", 200.0));
		
		Orcamento orcamento4 = new Orcamento(1000.0);
		orcamento4.adicionaItem(new Item("CANETA", 20.0));
		orcamento4.adicionaItem(new Item("LAPIS", 200.0));
				
		double calculoEsperadoICPPMinimaTaxacao = 25.0;
		double calculoEsperadoICPPMaximaTaxacao = 56.0;
		
		double calculoEsperadoIKCVMinimaTaxacao = 6.0;
		double calculoEsperadoIKCVMaximaTaxacao = 100.0;
		
		// Calculando ICPPMinimaTaxacao
		double impostoICPPMinimaTaxacao = icpp.calcula(orcamento1);
		
		// Calculando ICPPMaximaTaxacao
		double impostoICPPMaximaTaxacao = icpp.calcula(orcamento2);
		
		// Calculando IKCVMinimaTaxacao
		double impostoIKCVMinimaTaxacao = ikcv.calcula(orcamento3);
		
		// Calculando IKCVMaximaTaxacao
		double impostoIKCVMaximaTaxacao = ikcv.calcula(orcamento4);
		
		System.out.println("impostoICPPMinimaTaxacao: " + impostoICPPMinimaTaxacao);
		System.out.println("impostoICPPMaximaTaxacao: " + impostoICPPMaximaTaxacao);
		System.out.println("impostoIKCVMinimaTaxacao: " + impostoIKCVMinimaTaxacao);
		System.out.println("impostoIKCVMaximaTaxacao: " + impostoIKCVMaximaTaxacao);
		
		Assert.assertEquals(calculoEsperadoICPPMinimaTaxacao, impostoICPPMinimaTaxacao, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoICPPMaximaTaxacao, impostoICPPMaximaTaxacao, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoIKCVMinimaTaxacao, impostoIKCVMinimaTaxacao, 0.00000000000001);
		Assert.assertEquals(calculoEsperadoIKCVMaximaTaxacao, impostoIKCVMaximaTaxacao, 0.00000000000001);
		
	}
}
