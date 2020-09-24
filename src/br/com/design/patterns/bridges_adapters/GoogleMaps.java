package br.com.design.patterns.bridges_adapters;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {

		try {
			String googleMaps = "https://www.google.com.br/maps/place/Av.+Paulista,+São+Paulo+-+SP";
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			// ...
			return "mapa";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

}
