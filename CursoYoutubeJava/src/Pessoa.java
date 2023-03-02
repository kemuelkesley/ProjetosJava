
public class Pessoa {
	private String nome;
	private String sobreNome;
	private String fullName;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	public void NomeCompleto(String mensagem) {
		String takeName = this.getNome() + " " + this.getSobreNome();
		System.out.println(mensagem + " " + takeName);
	}
	
	public void calcularIdade(int anoAtual, int anonascimento) {
		int calculoIdade = anoAtual - anonascimento;
		System.out.println("Sua idade é : " + calculoIdade);
		
		if(calculoIdade >= 18) {
			System.out.println("Você tem " + calculoIdade + " " + "e é de maior.");
		}
	}
	
	
	
	
}
