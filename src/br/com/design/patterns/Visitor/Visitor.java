package br.com.design.patterns.Visitor;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubtracao(Subtracao subtracao);

	void visitaDivisao(Divisao divisao);

	void visitaMultiplicacao(Multiplicacao multiplicacao);

	void visitaRaizQuadrada(RaizQuadrada radizQuadrada);

	void visitaNumero(Numero numero);

}