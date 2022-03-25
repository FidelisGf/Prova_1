package transportadora.model;

import java.time.LocalDateTime;

public class Motorista extends Usuario{
	private String obs;
	private int fretesConcluidos;
	
	
	public Motorista() {
		super();
	}
	
	
	public Motorista(int id, String nome, String cpf, String endereco, String telefone, LocalDateTime dtNascimento,
			Funcoes funcao, boolean ativo, Sexos sexo) {
		super(id, nome, cpf, endereco, telefone, dtNascimento, funcao, ativo, sexo);
		// TODO Auto-generated constructor stub
	}

	public Motorista(String nome, String cpf, String endereco, String telefone, LocalDateTime dtNascimento,
			Funcoes funcao, boolean ativo, Sexos sexo) {
		super(nome, cpf, endereco, telefone, dtNascimento, funcao, ativo, sexo);
		// TODO Auto-generated constructor stub
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public int getFretesConcluidos() {
		return fretesConcluidos;
	}
	public void setFretesConcluidos(int fretesConcluidos) {
		this.fretesConcluidos = fretesConcluidos;
	}
	@Override
	public String toString() {
		return "Motorista [obs=" + obs + ", fretesConcluidos=" + fretesConcluidos + "]";
	}
	
	
	
	
}
