
public class Circulo implements FiguraGeometrica {
	// Atributos
	private int raio;

	
	// Constructor
	public Circulo(int raio) {		
		this.raio = raio;
	}

	
	//metodos especificos da classe

	
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}


	
}
