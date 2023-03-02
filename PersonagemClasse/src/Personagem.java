
public abstract class Personagem {
	private String nome;
	private int level;
	private int forca;
	private String classe;
	
	

	public Personagem(String nome, int level, int forca) {
		this.nome = nome;
		this.level = level;
		this.forca = forca;
	}

	
	
//	public void criarClasse(String nomeDaClasse) {
//		if (nomeDaClasse == "guerreiro") {
//			System.out.println("Classe criada: "+ nomeDaClasse);
//			this.setLevel(1);
//			this.setForca(10);
//			System.out.printf("Nome: %s Level: %s Força: %s" 					
//					,this.getNome(),
//					this.getLevel(),
//					this.getForca()
//			);
//			
//			
//		}
//	}
//	
	
	public String getClasse() {
		return classe;
	}
	
	
	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}
	
	
	
}
