package br.com.design.patterns.Visitor;

public class Subtracao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Subtracao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public Integer avalia() {
		Integer valorDaEsquerda = esquerda.avalia();
		Integer valorDaDireita = direita.avalia();
		
		return valorDaEsquerda - valorDaDireita;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaSubtracao(this);
	}
}
