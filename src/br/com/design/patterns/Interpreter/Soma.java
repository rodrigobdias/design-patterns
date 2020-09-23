package br.com.design.patterns.Interpreter;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public Integer avalia() {
		Integer valorDaEsquerda = esquerda.avalia();
		Integer valorDaDireita = direita.avalia();
		
		return valorDaEsquerda + valorDaDireita;
	}
}
