package locadora.modelo;

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
@Table(name = "tab_cidi")
public class Cidade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Codcid")
	private Long id;
	private String nome;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cod_est_fk", referencedColumnName = "cod_est", nullable = false)
	private Estado estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
