package br.com.design.patterns.observer;

import br.com.design.patterns.builder.NotaFiscal;

public interface AcaoAposGerarNota {

	void executa(NotaFiscal nf);
}
