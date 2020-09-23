package br.com.design.patterns.Interpreter;

public class Programa {
	
	public static void main(String[] args) {
				
		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		Expressao soma = new Soma(esquerda, direita);
		
		Integer resultado = soma.avalia();
		
		System.out.println(resultado);
		
		Expressao radixQuadratum = new RaizQuadrada(new Numero(9));
		
		resultado = radixQuadratum.avalia();
		
		System.out.println(resultado);
	}

}
