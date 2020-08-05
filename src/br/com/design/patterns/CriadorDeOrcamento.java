package br.com.design.patterns;

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
