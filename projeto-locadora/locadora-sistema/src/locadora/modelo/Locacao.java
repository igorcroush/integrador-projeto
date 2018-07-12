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
@Table(name = "tab_locacao")
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codLoca", nullable = false)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataLocaca", nullable = false)
	private Date dataLoca;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataEntrega", nullable = true)
	private Date dataEntrega;
	@Column(name = "qtdeLocada", nullable = false)
	private Integer qntde;
	@Column(name = "valor", scale = 7, precision = 2)
	private BigDecimal valorTotal;
	@Column(name = "multa", scale = 7, precision = 2, nullable = true)
	private BigDecimal multa;
	@Column(name = "devolucao")
	private Boolean devolvido;
	@ManyToOne(fetch = FetchType.EAGER)
	private Funcionario funcionario;
	@ManyToOne(fetch = FetchType.EAGER)
	private Cliente cliente;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataLoca() {
		return dataLoca;
	}
	public void setDataLoca(Date dataLoca) {
		this.dataLoca = dataLoca;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public Integer getQntde() {
		return qntde;
	}
	public void setQntde(Integer qntde) {
		this.qntde = qntde;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public BigDecimal getMulta() {
		return multa;
	}
	public void setMulta(BigDecimal multa) {
		this.multa = multa;
	}
	public Boolean getDevolvido() {
		return devolvido;
	}
	public void setDevolvido(Boolean devolvido) {
		this.devolvido = devolvido;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
