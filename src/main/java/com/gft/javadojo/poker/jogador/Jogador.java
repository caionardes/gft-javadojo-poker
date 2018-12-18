package com.gft.javadojo.poker.jogador;

import java.util.List;

import com.gft.javadojo.poker.baralho.Carta;

public class Jogador {

	String nomeJogador;
	List<Carta> mao;
	
	public Jogador(String nomeJogador, List<Carta> mao) {
		super();
		this.nomeJogador = nomeJogador;
		this.mao = mao;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}
	public List<Carta> getMao() {
		return mao;
	}
}
