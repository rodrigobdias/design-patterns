package br.com.design.patterns.Visitor;

public class Numero implements Expressao {

	private Integer numero;
	
	public Numero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public Integer avalia() {
		return this.numero;
	}

	public Integer getNumero() {
		return numero;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaNumero(this);
	}
	
	
}
