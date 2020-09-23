package br.com.design.patterns.Interpreter;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

    public RaizQuadrada(Expressao e) {
        this.expressao = e;
    }

    @Override
    public Integer avalia() {
    	
        return (int) Math.sqrt(expressao.avalia());
    }

}
