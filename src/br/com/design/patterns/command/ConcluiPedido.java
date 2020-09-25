package br.com.design.patterns.command;

public class ConcluiPedido implements Comando {

	private Pedido p;

	public ConcluiPedido(Pedido p) {
		this.p = p;
	}
	
	@Override
	public void executa() {
		System.out.println("Concluindo pedido do " + p.getCliente());
		p.finaliza();
	}

}
