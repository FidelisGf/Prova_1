package transportadora.model;

public enum Funcoes {
	Admin("Admin"),Motorista("Motorista");
	private String Funcao;
	public String getFuncoes() {
	        return Funcao;
	}
	Funcoes(String Funcao){
		this.Funcao = Funcao;
	}

}
