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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class ItemLocacao {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "dtLocacao", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataLoca;
	@Column(name="qtde_locada")
	private Integer qntde;
	private BigDecimal valorTotal;
	@ManyToOne
	@JoinColumn(name = "codMidiafk", referencedColumnName = "codMidia", nullable = false)
	private Midia midia;
	@ManyToOne
	@JoinColumn(name = "codlocalfk", referencedColumnName = "codLoca", nullable = false)
	private Locacao locacao;
	@Column(name="statusLoca")
	private Boolean status;
}
