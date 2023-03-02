
public  class Guerreiro extends Personagem {

	private String classe;
	
	public Guerreiro(String nome, int level, int forca) {
		super(nome, level, forca);
		
		//this.classe = "guerreiro";
	}
	
	

	public void criarClasse(String nomeDaClasse) {
		if (nomeDaClasse == "guerreiro") {
			System.out.println("Classe criada: "+ nomeDaClasse);
			this.setLevel(1);
			this.setForca(10);
			System.out.printf("Nome: %s Level: %s Força: %s\n" 					
					,this.getNome(),
					this.getLevel(),
					this.getForca()
					);
		}
	}

	
	public void atacar(int tipoAtaque) {
		int atacarComEspada = 15;
		int atacarComEscudo = 10;
		
		if (tipoAtaque <= 0 || tipoAtaque >= 3) {
			System.out.println("Ataque não encontrado ou não existe");			
		}else {
			System.out.println(getNome() +" usou o ataque "+ atacarComEspada);
			if (tipoAtaque == 1) {
				
			}
			
		}
	}
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
		
	
	
	
}
