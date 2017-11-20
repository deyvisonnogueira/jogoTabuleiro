package main;


import model.Tabuleiro;
import view.JanelaTabuleiroController;
import view.JanelaInicial;
import view.JanelaTabuleiro;

public class Configuracao {
	private Tabuleiro tabuleiro;
	private JanelaInicial janelaInicial;
	
	public void jogar(JanelaInicial janelaInicial) {
		this.janelaInicial = janelaInicial;
		new JanelaTabuleiro(this);
		// tamanho da imagem 
		
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public JanelaInicial getJanelaInicial() {
		return janelaInicial;
	}

	public void setJanelaInicial(JanelaInicial janelaInicial) {
		this.janelaInicial = janelaInicial;
	}
	
	
	
	
	
}
