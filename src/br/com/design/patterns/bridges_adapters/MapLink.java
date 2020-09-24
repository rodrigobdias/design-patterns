package br.com.design.patterns.bridges_adapters;

public class MapLink implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		// Faz alguma coisa ....
		return "mapa do maplink";
	}

}
