package transportadora.model;

public enum TiposDespesas {
	Alimentacao("Alimenta��o"),Combusitvel("Combustivel"),
	Pedagio("Pedagio"),Medica("Medica"),Manutencao("Manuten��o"),
	Hospedagem("Hospedagem");
	private String TipoDespesa;

	private TiposDespesas(String tipoDespesa) {
		TipoDespesa = tipoDespesa;
	}
	public String getTipoDespesa() {
		return TipoDespesa;
	}

	
}
