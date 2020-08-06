package br.com.design.patterns.observer;

import br.com.design.patterns.builder.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salvei no banco");

	}

}
