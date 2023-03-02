public class Pokemon {
	public String nome;
	public String tipo;
	public int level;
	public int forca;
	private String ataques[] = new String[5];
	
	
	public Pokemon(String nome, String tipo, int level) {
		this.nome = nome;
		this.tipo = tipo;
		this.level = level;
	}


	public void impressaoAtaques() {
		System.out.println("Ataques");
		for(int pos = 0; pos < ataques.length; pos++) {
			System.out.println(ataques[pos]);
		}
	}
	
	public int posAtaque(String n) {
		
		int r = -1;
		for (int pos = 0; pos < ataques.length; pos++) {
			if (n == ataques[pos]) {
				r = pos;
			}
		}
		return r;
	}

	public void nomeAtaque(int p) {
		System.out.println("Nome do Ataque" + ataques[p]);
	}
	
	
	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}


	public String[] getAtaque() {
		return ataques;
	}


	public void setAtaque(String[] ataques) {
		this.ataques = ataques;
	}
	
	
	
	
	
	
}
