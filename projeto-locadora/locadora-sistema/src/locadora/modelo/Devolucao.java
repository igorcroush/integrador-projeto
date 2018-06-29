package locadora.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Devolucao {
	private Long id;
	private Date dataEntrega;
	private BigDecimal multa;
	@OneToOne
	private Locacao locacao;
	@ManyToOne
	private Funcionario funcionario;
	@ManyToOne
	private Cliente cliente;

}
