package transportadora.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Frete {
	private int id;
	private Motorista motorista;
	private Caminhao caminhao;
	private List<Despesa> despesas;
	private BigDecimal kmInicial;
	private BigDecimal kmFinal;
	private BigDecimal vPorTonelada;
	private BigDecimal vBruto;
	private BigDecimal vLiquido;
	private List<Viagem> viagens;
	private BigDecimal vMotorista;
	private LocalDateTime dtInicioFrete;
	private LocalDateTime dtAtualizacaoFrete;
	private LocalDateTime dtConclusaoFrete;
}
