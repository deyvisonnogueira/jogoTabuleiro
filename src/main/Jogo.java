package main;

import main.Configuracao;
import view.JanelaInicial;

public class Jogo {
	public static void main(String[] args) {
		try {
			new JanelaInicial(new Configuracao());			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
