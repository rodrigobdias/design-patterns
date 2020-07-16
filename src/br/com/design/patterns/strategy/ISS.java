package br.com.design.patterns.strategy;

import br.com.design.patterns.Orcamento;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
