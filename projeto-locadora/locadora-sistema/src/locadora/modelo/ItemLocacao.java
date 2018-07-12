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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ItemLocacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "qtde_locada")
	private Integer qntde;
	@Column(name = "valor", scale = 7, precision = 2)
	private BigDecimal valor;
	@ManyToOne
	private Locacao locacao;
	@OneToMany
	private Filme filme;
	@OneToMany
	private Jogo jogo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQntde() {
		return qntde;
	}

	public void setQntde(Integer qntde) {
		this.qntde = qntde;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

}
