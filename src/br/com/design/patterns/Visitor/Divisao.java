package br.com.design.patterns.Visitor;

public class Divisao implements Expressao {

	private Expressao esquerda;
    private Expressao direita;

    public Divisao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public Integer avalia() {
        int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        
        return resultadoDaEsquerda / resultadoDaDireita;
    }

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaDivisao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

}
