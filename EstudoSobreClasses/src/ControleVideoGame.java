
public class ControleVideoGame {
	private String botoes;
	private String direcionais;
	
	/*
	 * public ControleVideoGame(String botoes, String direcionais) { this.botoes =
	 * botoes; this.direcionais = direcionais; }
	 */

	
	public void apertarBotao(String nomeDoBotao) {
		if (nomeDoBotao == "x") {
			System.out.printf("Botão %s Pressionado\n", nomeDoBotao.toUpperCase());			
		}
		if (nomeDoBotao == "y") {
			System.out.printf("Botão %s Pressionado\n", nomeDoBotao.toUpperCase());			
		}
		if (nomeDoBotao == "a") {
			System.out.printf("Botão %s Pressionado\n", nomeDoBotao.toUpperCase());			
		}
		if (nomeDoBotao == "b") {
			System.out.printf("Botão %s Pressionado\n", nomeDoBotao.toUpperCase());			
		}else {
			if (nomeDoBotao ==  null || nomeDoBotao == "") {
				System.out.println("Nemhum botão foi pressionado\n");
			}
		}
	}
	
	
	
	
	
	public String getBotoes() {
		return botoes;
	}


	public void setBotoes(String botoes) {
		this.botoes = botoes;
	}


	public String getDirecionais() {
		return direcionais;
	}


	public void setDirecionais(String direcionais) {
		this.direcionais = direcionais;
	}
	
	
	
}
