package br.com.design.patterns.builder;

import br.com.design.patterns.Item;
import br.com.design.patterns.Orcamento;

public class CriadorDeOrcamento {

	private Orcamento orcamento;

	public CriadorDeOrcamento valor(double valor) {
		this.orcamento = new Orcamento(valor);
		return this;
	}

	public CriadorDeOrcamento item(String item, double valor) {
		orcamento.adicionaItem(new Item(item, valor));
		return this;
	}

	public Orcamento build() {
		return orcamento;
	}

}
