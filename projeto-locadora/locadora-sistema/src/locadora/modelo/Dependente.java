package locadora.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="tab_depenente")
public class Dependente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codDep")
	private Long id;
	private String nome;
	@Column(name = "fone",nullable = false)
	private String telefone;
	@Column(name = "cpf",nullable = false,length = 14)
	private String cpf;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtNasc",nullable = true)
	private Date data_nasc;
	private BigDecimal multa;
}
