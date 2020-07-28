package br.com.design.patterns.chain_of_responsibility;

import br.com.design.patterns.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// não tem !!
	}

}
