package br.com.design.patterns.Visitor;

public class Programa {
	
	public static void main(String[] args) {
				
		/// Interpreter
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		Integer resultado = soma.avalia();
		
		System.out.println(resultado);
		
		Expressao radixQuadratum = new RaizQuadrada(new Numero(9));
		resultado = radixQuadratum.avalia();
		
		System.out.println(resultado);
		
		/// Visitor
		Visitor impressora = new ImpressoraVisitor();
		soma.aceita(impressora);
		
		Expressao multiplicacao = new Multiplicacao(new Numero(2), new Numero(5));
		resultado = multiplicacao.avalia();
		
		System.out.println("\n" + resultado);
		multiplicacao.aceita(impressora);
		
	}

}
