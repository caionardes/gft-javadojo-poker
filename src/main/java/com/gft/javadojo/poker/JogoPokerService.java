package com.gft.javadojo.poker;

import org.springframework.stereotype.Service;

import com.gft.javadojo.poker.baralho.Dealer;
import com.gft.javadojo.poker.jogador.Jogador;

@Service
public class JogoPokerService {

	public Jogador jogar() {
		Jogador jogador1 = Dealer.adicionarJogador("João");
		Jogador jogador2 = Dealer.adicionarJogador("Maria");
		Jogador jogador3 = Dealer.adicionarJogador("Fernando");
		Jogador jogador4 = Dealer.adicionarJogador("Mario");
		Jogador jogador5 = Dealer.adicionarJogador("Lucas");

		Jogador temp = getJogadorComMelhorMao(jogador1, jogador2);
		temp = getJogadorComMelhorMao(temp, jogador3);
		temp = getJogadorComMelhorMao(temp, jogador4);
		temp = getJogadorComMelhorMao(temp, jogador5);
		return temp;
	}

	public Jogador getJogadorComMelhorMao(Jogador jogador1, Jogador jogador2) {
		return jogador1;
	}
}
