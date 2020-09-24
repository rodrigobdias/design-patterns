package br.com.design.patterns.bridges_adapters;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) throws Exception {
		
		/// Bridges
		// regra de negocio
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("Avenida Paulista");
		//....
		
		/// Adapters
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.hoje();
	}
}
