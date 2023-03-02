
public class Pessoa {
	private String nome;
	protected  String sexo;
	
	

	public Pessoa(String nome) {
		this.nome = nome;
		this.sexo = null;
	}

	
	public void mostrarSexo() {
		System.out.println(this.nome);
		System.out.println(this.sexo);
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
}
