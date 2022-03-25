package transportadora.model;

import java.math.BigDecimal;

public class Despesa {
	private int idDespesa;
	private TiposDespesas tipoDespesa;
	private String obs;
	private BigDecimal valor;
	
	public Despesa() {
		super();
	}

	public Despesa(TiposDespesas tipoDespesa, String obs, BigDecimal valor) {
		super();
		this.tipoDespesa = tipoDespesa;
		this.obs = obs;
		this.valor = valor;
	}

	public Despesa(int idDespesa, TiposDespesas tipoDespesa, String obs, BigDecimal valor) {
		super();
		this.idDespesa = idDespesa;
		this.tipoDespesa = tipoDespesa;
		this.obs = obs;
		this.valor = valor;
	}

	public int getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(int idDespesa) {
		this.idDespesa = idDespesa;
	}

	public TiposDespesas getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TiposDespesas tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Despesa [idDespesa=" + idDespesa + ", tipoDespesa=" + tipoDespesa + ", obs=" + obs + ", valor=" + valor
				+ "]";
	}
	
	
	
	
	
}
