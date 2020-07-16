package br.com.design.patterns.strategy;

import br.com.design.patterns.Orcamento;

public interface Imposto {
	double calcula(Orcamento orcamento);
}
