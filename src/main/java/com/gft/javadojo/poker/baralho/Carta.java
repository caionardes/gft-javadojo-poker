package com.gft.javadojo.poker.baralho;

import java.util.LinkedList;

public class Carta {

	private String valor;
	private int ordem;

	private Carta(String valor, int ordem) {
		this.valor = valor;
		this.ordem = ordem;
	}
	
	public String getValor() {
		return valor;
	}
	public int getOrdem() {
		return ordem;
	}

	public static Carta CARTA_1;
	public static Carta CARTA_2;
	public static Carta CARTA_3;
	public static Carta CARTA_4;
	public static Carta CARTA_5;
	public static Carta CARTA_6;
	public static Carta CARTA_7;
	public static Carta CARTA_8;
	public static Carta CARTA_9;
	public static Carta CARTA_10;

	public static Carta CARTA_J;
	public static Carta CARTA_Q;
	public static Carta CARTA_K;

	public static LinkedList<Carta> baralho = new LinkedList<>();
	static {
		CARTA_1 = new Carta("1", 1);  
		CARTA_2 = new Carta("2", 2);  
		CARTA_3 = new Carta("3", 3);  
		CARTA_4 = new Carta("4", 4);  
		CARTA_5 = new Carta("5", 5);  
		CARTA_6 = new Carta("6", 6);  
		CARTA_7 = new Carta("7", 7);  
		CARTA_8 = new Carta("8", 8);  
		CARTA_9 = new Carta("9", 9);  
		CARTA_10 = new Carta("10", 10);
		CARTA_J = new Carta("J", 11);
		CARTA_Q = new Carta("Q", 12);
		CARTA_K = new Carta("K", 13);  

		baralho.add(CARTA_1);
		baralho.add(CARTA_2);
		baralho.add(CARTA_3);
		baralho.add(CARTA_4);
		baralho.add(CARTA_5);
		baralho.add(CARTA_6);
		baralho.add(CARTA_7);
		baralho.add(CARTA_8);
		baralho.add(CARTA_9);
		baralho.add(CARTA_10);
		baralho.add(CARTA_J);
		baralho.add(CARTA_Q);
		baralho.add(CARTA_K);
	}
	
	@Override
	public String toString() {
		return valor;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Carta && (valor.equals(((Carta) obj).valor));
	}
}
