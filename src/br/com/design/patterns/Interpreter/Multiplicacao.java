package br.com.design.patterns.Interpreter;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public Integer avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        
        return resultadoDaEsquerda * resultadoDaDireita;
    }

}
