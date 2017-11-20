/**
 * 
 */
package model;

/**
 * @author aluno
 *
 */
public class Objeto {
	private int id;
	private Tabuleiro tabuleiro;
	private String imagem;
	private int linha;
	private int coluna;
	private String nome;
	
	public Objeto(){
		
	}

	public Objeto(Tabuleiro tabuleiro) {
		this.setTabuleiro(tabuleiro);
	}

	public void movimentarPara(int linha, int coluna) {
		this.getTabuleiro().movimentar(this.getLinha(), this.getColuna(), linha, coluna);
		this.setLinha(linha);
		this.setColuna(coluna);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
		//throw new IllegalArgumentException("Erro: O tabuleiro não pode ser nulo.");
	}

	/**
	 * @return the imagem
	 */
	public String getImagem() {
		return imagem;
	}

	/**
	 * @param imagem
	 *            the imagem to set
	 */
	public void setImagem(String imagem) {
		if (imagem != null) {
			this.imagem = imagem;
		} else {
			throw new IllegalArgumentException("Erro: A imagem não pode ser nula.");
		}
	}

	/**
	 * @return the linha
	 */
	public int getLinha() {
		return linha;
	}

	/**
	 * @param linha
	 *            the linha to set
	 */
	public void setLinha(int linha) {
		Facade.linhaValida(linha, this.getTabuleiro().getObjetos());
		this.linha = linha;
	}

	/**
	 * @return the coluna
	 */
	public int getColuna() {
		return coluna;
	}

	/**
	 * @param coluna
	 *            the coluna to set
	 */
	public void setColuna(int coluna) {
		Facade.linhaValida(coluna, this.getTabuleiro().getObjetos());
		this.coluna = coluna;
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
		this.nome = nome;
	}

}
