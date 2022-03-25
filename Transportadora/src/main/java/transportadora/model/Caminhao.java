package transportadora.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Caminhao {
	private int id;
	private String marca;
	private String placa;
	private String modelo;
	private LocalDateTime ano;
	private BigDecimal tara;
	private String cor; 
	private BigDecimal capacidadeCarga;
	
	public Caminhao() {
		super();
	}

	public Caminhao(String marca, String placa, String modelo, LocalDateTime ano, BigDecimal tara, String cor,
			BigDecimal capacidadeCarga) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.tara = tara;
		this.cor = cor;
		this.capacidadeCarga = capacidadeCarga;
	}

	public Caminhao(int id, String marca, String placa, String modelo, LocalDateTime ano, BigDecimal tara, String cor,
			BigDecimal capacidadeCarga) {
		super();
		this.id = id;
		this.marca = marca;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.tara = tara;
		this.cor = cor;
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDateTime getAno() {
		return ano;
	}

	public void setAno(LocalDateTime ano) {
		this.ano = ano;
	}

	public BigDecimal getTara() {
		return tara;
	}

	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public BigDecimal getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(BigDecimal capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		return "Caminhao [id=" + id + ", marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", ano=" + ano
				+ ", tara=" + tara + ", cor=" + cor + ", capacidadeCarga=" + capacidadeCarga + "]";
	}
	
	
}
