package main;


import model.Tabuleiro;
import view.JanelaTabuleiroController;
import view.JanelaTabuleiro;

public class Configuracao {
	private Tabuleiro tabuleiro;
	
	public void jogar() {
		
		new JanelaTabuleiro(this);
		// tamanho da imagem 
		
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	
	
	
	
}
