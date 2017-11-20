package model;
import model.EnumClasse;

public class Personagem extends Objeto{

	private int vida;
	private int ataque;
	private Classe classe;
	private QuantidadeDeCelulas quantidadeDeCelulasAtaque;
	private QuantidadeDeCelulas quantidadeDeCelulasAndar;
	private Jogador jogador;
	
	public Personagem(Tabuleiro tabuleiro,Classe c, Jogador jogador, String imagem) {
		super(tabuleiro,imagem);
		this.classe = c;
		this.ataque = c.getAtaque();
		this.vida = c.getVida();
		this.jogador = jogador;
	}
	
	public Personagem() {
		super();
		this.ataque = this.classe.getAtaque();
		this.vida = this.classe.getVida();
	}
	
	
	private void quantidadeDeCelulasValida (QuantidadeDeCelulas quantidadeDeCelulas) {
		if (quantidadeDeCelulas == null) {
			throw new IllegalArgumentException("Erro: A quantidade de celulas não pode ser nula.");
		}
	}
	
	public void atacar(Personagem personagem) {
		if (this.getVida() > 0) {					
			if (personagem != null) {
				personagem.setVida(personagem.getVida() - this.getAtaque());
			}else {
				throw new IllegalArgumentException("Erro: O personagem não pode ser nulo.");
			}
		}else {
			throw new IllegalStateException("Erro: O personagem está morto.");
		}
	}
	
	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida < 0 ? 0 : vida;
	}

	
	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public QuantidadeDeCelulas getQuantidadeDeCelulasAtaque() {
		return quantidadeDeCelulasAtaque;
	}

	public void setQuantidadeDeCelulasAtaque(QuantidadeDeCelulas quantidadeDeCelulasAtaque) {
		this.quantidadeDeCelulasValida(quantidadeDeCelulasAtaque);
		this.quantidadeDeCelulasAtaque = quantidadeDeCelulasAtaque;
	}

	public QuantidadeDeCelulas getQuantidadeDeCelulasAndar() {
		return quantidadeDeCelulasAndar;
	}

	public void setQuantidadeDeCelulasAndar(QuantidadeDeCelulas quantidadeDeCelulasAndar) {
		this.quantidadeDeCelulasValida(quantidadeDeCelulasAndar);
		this.quantidadeDeCelulasAndar = quantidadeDeCelulasAndar;			
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
