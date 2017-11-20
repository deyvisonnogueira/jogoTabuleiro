package model;

public class Classe {
	private String tipo;
	private int valor;
	private int vida;
	private int ataque;
	
	
	
	public Classe(String tipo, int valor, int vida, int ataque) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.vida = vida;
		this.ataque = ataque;
	}

	public Classe(String tipo, int valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public Classe(){
		
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		if (ataque >= 0) {
			this.ataque = ataque;
		}else {
			throw new IllegalArgumentException("Erro: O ataque não pode ser negativo.");
		}	
		
	}
	
	
}
