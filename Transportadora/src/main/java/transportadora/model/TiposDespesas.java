package transportadora.model;

public enum TiposDespesas {
	Alimentacao("Alimentação"),Combusitvel("Combustivel"),
	Pedagio("Pedagio"),Medica("Medica"),Manutencao("Manutenção"),
	Hospedagem("Hospedagem");
	private String TipoDespesa;

	private TiposDespesas(String tipoDespesa) {
		TipoDespesa = tipoDespesa;
	}
	public String getTipoDespesa() {
		return TipoDespesa;
	}

	
}
