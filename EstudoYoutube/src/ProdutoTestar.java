/**
 * 
 */

/**
 * @author kemuel
 *
 */
public class ProdutoTestar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Construtor padrão.
		Produto p1 = new Produto();
		p1.nome = "Caneta Preta";
		p1.marca = "Bic";
		p1.valor = 1.50f;
		// Construtor de dois parametros
		Produto p2 = new Produto("Caneta verme");
		
		// construtor de três parametros
		Produto p3 = new Produto("Borracha", "Mercur", 1.89f);

	}

}
