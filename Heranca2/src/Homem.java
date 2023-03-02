
public class Homem extends Pessoa {

		
	public Homem(String nome) {
		super(nome);
	}
	

	public void mostrarSexo() {
		System.out.println(this.getNome());
		this.sexo = "masculino";
		System.out.println(this.sexo);
	}
	
	
}
