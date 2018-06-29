package locadora.modelo;

import java.math.BigDecimal;
import java.util.Date;

public class Locacao {
	private Long id;
	private Date dataLoca;
	private Date dataEntrega;
	private Double multa;
	private Integer qntde;
	private BigDecimal valorParcial;
	private Funcionario funcionario;
	private Cliente cliente;
	
}
