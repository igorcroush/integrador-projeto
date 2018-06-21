package locadora.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_venda")
public class Item_venda {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_item")
	private Long id;
	@Column(name = "itemvalor_parcial", nullable = false, precision = 7, scale = 2)
	private BigDecimal valor;
	@Column(name = "qtde_ven", nullable = false)
	private Integer quantidade;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_ven_fk", referencedColumnName = "cod_ven", nullable = false)
	private Venda venda;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_prod_fk", referencedColumnName = "cod_prod", nullable = false)
	private Produto produto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
