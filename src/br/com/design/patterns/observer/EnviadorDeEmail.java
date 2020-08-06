package br.com.design.patterns.observer;

import br.com.design.patterns.builder.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por email");

	}

}
