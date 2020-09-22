package br.com.design.patterns.flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> musica) {
		
		Player player = new Player();
		
		StringBuilder musicaEmNotas = new StringBuilder();
		
		musica.forEach(nota -> musicaEmNotas.append(nota.simbolo() + " "));
		
		System.out.println(musicaEmNotas.toString());
		
		player.play(musicaEmNotas.toString());
	}
}
