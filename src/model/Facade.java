/**
 * 
 */
package model;

/**
 * @author matheus
 *
 */
public class Facade {
	
	private Facade() {
		//
	}
	
	public static void colunaValida(int coluna, Objeto[][] objetos) {
		if (coluna < 0 || coluna >= objetos[0].length) {
			throw new IllegalArgumentException("A coluna é inválida.");
		}
	}

	public static void linhaValida(int linha, Object[][] objetos) {
		if (linha < 0 || linha >= objetos.length) {
			throw new IllegalArgumentException("A linha é inválida.");
		}
	}
	
	public static void dinheiroValido(float dinheiro) {
		if (dinheiro < 0) {
			throw new IllegalArgumentException("Erro: O dinheiro não pode ser negativo.");
		}		
	}
	
	public static void tabuleiroValido(Tabuleiro tabuleiro) {
		
	}
	
}
