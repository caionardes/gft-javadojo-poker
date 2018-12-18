package com.gft.javadojo.poker.baralho;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gft.javadojo.poker.jogador.Jogador;

public class Dealer {

	private static int QTD_CARTAS_POR_MAO = 5;
	
	public static Jogador adicionarJogador(String nomeJogador) {
		List<Carta> mao = new ArrayList<>();
		for (int i = 0; i < QTD_CARTAS_POR_MAO; i++) {
			mao.add(Carta.baralho.get(new Random().nextInt(Carta.baralho.size())));
		}
		return new Jogador(nomeJogador, mao);
	}
}
