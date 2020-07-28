package br.com.design.patterns.chain_of_responsibility;

import br.com.design.patterns.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
