package br.com.design.patterns.strategy;

import br.com.design.patterns.Imposto;
import br.com.design.patterns.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
