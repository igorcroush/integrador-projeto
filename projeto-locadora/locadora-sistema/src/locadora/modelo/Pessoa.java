package locadora.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
@Table(name = "tab_pessoa")
public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_pessoa")
	private Long id;
	private String nome;
	@Column(name = "fone", nullable = false, length = 14)
	private String telefone;
	@Column(name = "endereco", nullable = false, length = 50)
	private String endereco;
	private String numero;
	@ManyToOne(fetch = FetchType.EAGER)
	private Cidade cidade;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
