package locadora.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Devolucao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="codDevo",nullable =false)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_Entrega",nullable = false)
	private Date dataEntrega;
	@Column(name="multaLoca",nullable =true)
	private BigDecimal Valormulta;
	@OneToOne
	@JoinColumn(name = "codlocafk", referencedColumnName = "codLoca", nullable = false)
	private Locacao locacao;
	@ManyToOne
	@JoinColumn(name = "codfunfk", referencedColumnName = "codfun", nullable = false)
	private Funcionario funcionario;
	@ManyToOne
	@JoinColumn(name = "codclifk", referencedColumnName = "codcli", nullable = false)
	private Cliente cliente;

}
