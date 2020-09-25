package br.com.design.patterns.command;

import java.util.Calendar;

public class Pedido {

	private String cliente;
	private double valor;
	private Status status;
	private Calendar dataFinalizacao;
	
	public Pedido(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public void paga() {
		this.status = Status.PAGO;
	}
	
	
	public void finaliza() {
		dataFinalizacao = Calendar.getInstance();
		this.status = Status.ENTREGUE;
	}

	public String getCliente() {
		return this.cliente;
	}

}
