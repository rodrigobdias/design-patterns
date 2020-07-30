package br.com.design.patterns.strategy;

import br.com.design.patterns.Imposto;
import br.com.design.patterns.Orcamento;

public class CalculadorDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {

		double valor = imposto.calcula(orcamento);
		return valor;

	}
}
