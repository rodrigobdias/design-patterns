package br.com.design.patterns.strategy;

import br.com.design.patterns.Imposto;
import br.com.design.patterns.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculoDoOutroImposto(orcamento);
	}

}
