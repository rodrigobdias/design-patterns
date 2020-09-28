package br.com.design.patterns.facades_singletons;

public class Programa {

	public static void main(String[] args) {
		
		/// qualquer coisa ...
		String cpf = "123";
		Cliente cliente = new Cliente() ;
		double valor = 5000.0;
		Fatura fatura = new Fatura(cliente, valor);
		Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
		/// ....

		
		
		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();

		facade.buscaCliente(cpf);
		facade.criaFatura(cliente, valor);
		facade.fazContato(cliente, cobranca);
		facade.geraCobranca(fatura);

	}
}
