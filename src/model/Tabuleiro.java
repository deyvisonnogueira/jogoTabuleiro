/**
 * 
 */
package model;

/**
 * @author aluno
 *
 */
public class Tabuleiro {
	private String background;
	private Objeto[][] objetos;

	public Tabuleiro(String background, Objeto[][] objetos) {
		this.setBackground(background);
		this.setObjetos(objetos);
	}

	public void movimentar(int linhaAtual, int colunaAtual, int linhaNova, int colunaNova) {
		Objeto[][] objetos = this.getObjetos();
		this.linhaColunaValida(linhaAtual, colunaAtual);
		this.linhaColunaValida(linhaNova, colunaNova);
		this.existeObjeto(linhaNova, colunaNova);
		objetos[linhaNova][colunaNova] = objetos[linhaAtual][colunaAtual];
		objetos[linhaAtual][colunaAtual] = null;
	}

	public void preencher(Objeto objeto, int linha, int coluna) {
		this.linhaColunaValida(linha, coluna);
		this.existeObjeto(linha, coluna);
		this.getObjetos()[linha][coluna] = objeto;
	}

	private void linhaColunaValida(int linha, int coluna) {
		Facade.linhaValida(linha, this.getObjetos());
		Facade.colunaValida(coluna, this.getObjetos());
	}

	private void existeObjeto(int linha, int coluna) {
		if (this.getObjetos()[linha][coluna] != null) {
			throw new IllegalStateException("Erro: Já existe um objeto na posição.");
		}
	}

	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * @param background
	 *            the background to set
	 */
	public void setBackground(String background) {
		if (background != null) {
			this.background = background;
		}else {
			throw new IllegalArgumentException("Erro: O background não pode ser nulo.");
		}		
	}

	/**
	 * @return the objetos
	 */
	public Objeto[][] getObjetos() {
		return objetos;
	}

	/**
	 * @param objetos
	 *            the objetos to set
	 */
	public void setObjetos(Objeto[][] objetos) {
		if (objetos != null) {
			this.objetos = objetos;
		} else {
			throw new IllegalArgumentException("Erro: O parâmetro objetos está nulo.");
		}
	}

}
