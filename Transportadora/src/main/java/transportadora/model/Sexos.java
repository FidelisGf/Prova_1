package transportadora.model;

public enum Sexos {
	Masculino("Masculino"),Motorista("Feminino"),Outros("Outros");
	private String sexo;
	Sexos(String sexo){
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
	
}
