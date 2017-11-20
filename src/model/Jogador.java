/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author matheus
 *
 */
public class Jogador {
	private List<Personagem> personagens;
	private String nome;
	private float dinheiro;
	private boolean jogar;

	public Jogador(String nome, float dinheiro) {
		super();
		this.nome = nome;
		this.dinheiro = dinheiro;
		this.setJogar(false);
		this.setPersonagens(new ArrayList<Personagem>());
	}

	private void personagemValido(Personagem personagem) {
		if (personagem == null) {
			throw new IllegalArgumentException("Erro: O personagem não pode ser nulo.");
		}
	}

	public void atacar(Personagem personagemAtacado, Personagem personagemAtacante) {
		this.personagemValido(personagemAtacado);
		this.personagemValido(personagemAtacante);
		personagemAtacante.atacar(personagemAtacado);
	}

	/**
	 * @return the personagens
	 */
	public List<Personagem> getPersonagens() {
		return personagens;
	}

	/**
	 * @param personagens
	 *            the personagens to set
	 */

	public boolean addPersonagem(Personagem personagem) {
		if (this.getDinheiro() >= personagem.getClasse().getValor()) {

			this.personagens.add(personagem);
			return true;
		}else{
			return false;
		}
	}

	public void setPersonagens(List<Personagem> personagens) {
		if (personagens != null) {
			this.personagens = personagens;
		} else {
			throw new IllegalArgumentException("Erro: A lista de personagens não pode ser nula.");
		}

	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("O nome não pode ser nulo.");
		}
	}

	/**
	 * @return the dinheiro
	 */
	public float getDinheiro() {
		return dinheiro;
	}

	/**
	 * @param dinheiro
	 *            the dinheiro to set
	 */
	public void setDinheiro(float dinheiro) {
		Facade.dinheiroValido(dinheiro);
		this.dinheiro = dinheiro;
	}

	public void diminuirDinheiro(float valor) {
		this.dinheiro -= valor;
	}

	public boolean isJogar() {
		return jogar;
	}

	public void setJogar(boolean jogar) {
		this.jogar = jogar;
	}

}
