package com.gft.javadojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gft.javadojo.poker.JogoPokerService;
import com.gft.javadojo.poker.baralho.Dealer;
import com.gft.javadojo.poker.jogador.Jogador;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JogoPokerserviceTest {

	@Autowired
	private JogoPokerService jogoPokerService;
	
	@Test
	public void getJogadorComMelhorMao_test() {
		Jogador joao = Dealer.adicionarJogador("João");
		Jogador maria = Dealer.adicionarJogador("Maria");

		Jogador jogadorComMelhorMao = jogoPokerService.getJogadorComMelhorMao(joao, maria);

		assertEquals(jogadorComMelhorMao, joao);
	}

}

