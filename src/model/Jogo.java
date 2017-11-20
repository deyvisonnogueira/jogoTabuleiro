/**
 * 
 */
package model;

/**
 * @author matheus
 *
 */
public class Jogo {
	private Jogador jogador1;
	private Jogador jogador2;
	private Tabuleiro tabuleiro;

	public Jogo(Jogador jogador1, Jogador jogador2, Tabuleiro tabuleiro) {
		super();
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
		this.tabuleiro = tabuleiro;
	}
	
	private void jogadorValido(Jogador jogador) {
		if (jogador == null) {
			throw new IllegalArgumentException("Erro: O jogador não pode ser nulo.");
		}
	}

	/**
	 * @return the jogador1
	 */
	public Jogador getJogador1() {
		return jogador1;
	}

	/**
	 * @param jogador1
	 *            the jogador1 to set
	 */
	public void setJogador1(Jogador jogador1) {
		this.jogadorValido(jogador1);
		this.jogador1 = jogador1;
	}

	/**
	 * @return the jogador2
	 */
	public Jogador getJogador2() {
		return jogador2;
	}

	/**
	 * @param jogador2
	 *            the jogador2 to set
	 */
	public void setJogador2(Jogador jogador2) {
		this.jogadorValido(jogador2);
		this.jogador2 = jogador2;
	}

	/**
	 * @return the tabuleiro
	 */
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	/**
	 * @param tabuleiro
	 *            the tabuleiro to set
	 */
	public void setTabuleiro(Tabuleiro tabuleiro) {
		Facade.tabuleiroValido(tabuleiro);
		this.tabuleiro = tabuleiro;
	}

}
