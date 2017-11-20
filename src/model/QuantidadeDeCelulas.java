package model;

public class QuantidadeDeCelulas {
	private int frente;
	private int atras;
	private int direita;
	private int esquerda;	
	
	public QuantidadeDeCelulas(int frente, int atras, int direita, int esquerda) {
		super();
		this.setFrente(frente);
		this.setAtras(atras);
		this.setDireita(direita);
		this.setEsquerda(esquerda);
	}

	private void qntdValida(int qntd) {
		if (qntd < 0) {
			throw new IllegalArgumentException("Erro: A quantidade é inválida.");
		}
	}
	
	public int getAtras() {
		return atras;
	}

	public void setAtras(int atras) {
		this.qntdValida(atras);
		this.atras = atras;
	}

	public int getDireita() {
		return direita;
	}

	public void setDireita(int direita) {
		this.qntdValida(direita);
		this.direita = direita;
	}

	public int getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(int esquerda) {
		this.qntdValida(esquerda);
		this.esquerda = esquerda;
	}

	public int getFrente() {
		return frente;
	}

	public void setFrente(int frente) {
		this.qntdValida(frente);
		this.frente = frente;
	}

}
