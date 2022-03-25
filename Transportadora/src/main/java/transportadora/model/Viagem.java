package transportadora.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Viagem {
	private int idViagem;
	private String saidaViagem;
	private String destinoViagem;
	private LocalDateTime dtSaida;
	private LocalDateTime dtChegada;
	private Double duracaoViagem;
	private BigDecimal distanciaViagem;
	private String obs;
	
	
	public Viagem() {
		super();
	}
	public Viagem(String saidaViagem, String destinoViagem, LocalDateTime dtSaida, LocalDateTime dtChegada,
			Double duracaoViagem, BigDecimal distanciaViagem, String obs) {
		super();
		this.saidaViagem = saidaViagem;
		this.destinoViagem = destinoViagem;
		this.dtSaida = dtSaida;
		this.dtChegada = dtChegada;
		this.duracaoViagem = duracaoViagem;
		this.distanciaViagem = distanciaViagem;
		this.obs = obs;
	}
	public Viagem(int idViagem, String saidaViagem, String destinoViagem, LocalDateTime dtSaida,
			LocalDateTime dtChegada, Double duracaoViagem, BigDecimal distanciaViagem, String obs) {
		super();
		this.idViagem = idViagem;
		this.saidaViagem = saidaViagem;
		this.destinoViagem = destinoViagem;
		this.dtSaida = dtSaida;
		this.dtChegada = dtChegada;
		this.duracaoViagem = duracaoViagem;
		this.distanciaViagem = distanciaViagem;
		this.obs = obs;
	}
	public int getIdViagem() {
		return idViagem;
	}
	public void setIdViagem(int idViagem) {
		this.idViagem = idViagem;
	}
	public String getSaidaViagem() {
		return saidaViagem;
	}
	public void setSaidaViagem(String saidaViagem) {
		this.saidaViagem = saidaViagem;
	}
	public String getDestinoViagem() {
		return destinoViagem;
	}
	public void setDestinoViagem(String destinoViagem) {
		this.destinoViagem = destinoViagem;
	}
	public LocalDateTime getDtSaida() {
		return dtSaida;
	}
	public void setDtSaida(LocalDateTime dtSaida) {
		this.dtSaida = dtSaida;
	}
	public LocalDateTime getDtChegada() {
		return dtChegada;
	}
	public void setDtChegada(LocalDateTime dtChegada) {
		this.dtChegada = dtChegada;
	}
	public Double getDuracaoViagem() {
		return duracaoViagem;
	}
	public void setDuracaoViagem(Double duracaoViagem) {
		this.duracaoViagem = duracaoViagem;
	}
	public BigDecimal getDistanciaViagem() {
		return distanciaViagem;
	}
	public void setDistanciaViagem(BigDecimal distanciaViagem) {
		this.distanciaViagem = distanciaViagem;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	
}
