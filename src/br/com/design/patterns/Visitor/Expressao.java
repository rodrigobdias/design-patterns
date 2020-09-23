package br.com.design.patterns.Visitor;

public interface Expressao {

	Integer avalia();
	void aceita(Visitor impressora);
}
