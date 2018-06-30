package locadora.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tab_locacao")
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name ="dataLocaca", nullable = false)
	private Date dataLoca;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataEntrega", nullable = false)
	private Date dataEntrega;
	@Column(name = "qtdeLocada", nullable = false)
	private Integer qntde;
	private BigDecimal valorParcial;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_funk_fk", referencedColumnName = "cod_funk", nullable = false)
	private Funcionario funcionario;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente", nullable = false)
	private Cliente cliente;
	
}
