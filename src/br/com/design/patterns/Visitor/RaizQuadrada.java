package br.com.design.patterns.Visitor;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

    public RaizQuadrada(Expressao e) {
        this.expressao = e;
    }

    @Override
    public Integer avalia() {
    	
        return (int) Math.sqrt(expressao.avalia());
    }

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaRaizQuadrada(this);
	}

	public Expressao getExpressao() {
		return expressao;
	}




}
