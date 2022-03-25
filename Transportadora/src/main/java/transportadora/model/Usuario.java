package transportadora.model;

import java.time.LocalDateTime;

public abstract class Usuario {
	private int id;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private LocalDateTime dtNascimento;
	private Funcoes funcao;
	private boolean ativo;
	private Sexos sexo;
	private String userName;
	private String userPass;
	
	public Usuario() {
		super();
	}
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserPass() {
		return userPass;
	}



	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	
	public Usuario(String nome, String cpf, String endereco, String telefone, LocalDateTime dtNascimento,
			Funcoes funcao, boolean ativo, Sexos sexo, String userName, String userPass) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.funcao = funcao;
		this.ativo = ativo;
		this.sexo = sexo;
		this.userName = userName;
		this.userPass = userPass;
	}



	public Usuario(int id, String nome, String cpf, String endereco, String telefone, LocalDateTime dtNascimento,
			Funcoes funcao, boolean ativo, Sexos sexo, String userName, String userPass) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.funcao = funcao;
		this.ativo = ativo;
		this.sexo = sexo;
		this.userName = userName;
		this.userPass = userPass;
	}



	public Usuario(String nome, String cpf, String endereco, String telefone, LocalDateTime dtNascimento,
			Funcoes funcao, boolean ativo, Sexos sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.funcao = funcao;
		this.ativo = ativo;
		this.sexo = sexo;
	}

	public Usuario(int id, String nome, String cpf, String endereco, String telefone, LocalDateTime dtNascimento,
			Funcoes funcao, boolean ativo, Sexos sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.funcao = funcao;
		this.ativo = ativo;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDateTime getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(LocalDateTime dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Funcoes getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcoes funcao) {
		this.funcao = funcao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Sexos getSexo() {
		return sexo;
	}
	public void setSexo(Sexos sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone="
				+ telefone + ", dtNascimento=" + dtNascimento + ", funcao=" + funcao + ", ativo=" + ativo + ", sexo="
				+ sexo + "]";
	}
	
	
	
}
