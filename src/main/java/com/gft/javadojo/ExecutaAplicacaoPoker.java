package com.gft.javadojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gft.javadojo.poker.JogoPokerService;

/**
 * No jogo de Poker, uma mão consiste em cinco cartas que podem ser comparadas, da mais baixa para a mais alta.
 * Essa é a ordem para determinar qual é a melhor mão da rodada:
 * 
 * Primeira Parte:
 * 
 * 1 - Carta Alta: A carta de maior valor.
 * 2 - Um Par: Duas cartas do mesmo valor.
 * 3 - Dois Pares: Dois pares diferentes.
 * 4 - Trinca: Três cartas do mesmo valor e duas de valores diferentes.
 *  Atenção neste ponto, quatro cartas iguais não é a 5° prioridade, na verdade é a 8° !
 */
@SpringBootApplication
public class ExecutaAplicacaoPoker {

	public static void main(String[] args) {
		SpringApplication.run(ExecutaAplicacaoPoker.class, args).close();
	}

	@Autowired
	private JogoPokerService jogoPokerService;

	@Bean
	public CommandLineRunner run() {
		return args -> {
			jogoPokerService.jogar();
		};
	}
}

