package br.com.design.patterns.Interpreter;

public class Numero implements Expressao {

	private Integer numero;
	
	public Numero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public Integer avalia() {
		return this.numero;
	}
	
	
}
