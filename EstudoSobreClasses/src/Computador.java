
public class Computador {
	private String processador;
	private String fonte;
	private String memoria;
	private String armazenamento;
	String sistemaOperacional;
	
	// metodos
	
	public void descricao() {
		System.out.println("Processador: "+this.getProcessador());
		System.out.println("Fonte: "+this.getFonte());
		System.out.println("Memoria: "+this.getMemoria());
		System.out.println("Armazenamento: "+this.getArmazenamento());
		System.out.println("Sistem Operacional: "+ this.sistemaOperacional);
	}
	
	
	public void ligar() {
		System.out.println("Computador ligando");
	}
	
	public void mensagemIniciarSistema () {
		System.out.println("Iniciando sistema operacional: "+ sistemaOperacional);
	}	
	
	
	public void mostrarTudo() {
		ligar();
		mensagemIniciarSistema();
	}

	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	
	
	
}
