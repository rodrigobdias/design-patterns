package br.com.design.patterns.Visitor;

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
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSoma(this);
	}
}
