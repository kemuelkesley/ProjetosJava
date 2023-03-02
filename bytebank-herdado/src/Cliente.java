
public class Cliente implements Autenticavel {

	
	private AutenticavelUtil util;
	
	
	public Cliente() {
		Autenticavel = new AutenticavelUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	

}
