package locadora.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_forncedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codForn")
	private Long id;
	@Column(name = "nomeForn", nullable = false, length = 20)
	private String nome;
	@Column(name = "cnpj", nullable = false, length = 20)
	private String cnpjForn;
	@Column(name = "foneForn", nullable = false, length = 14)
	private String telefone;
	@Column(name = "enderecoForn", nullable = false, length = 14)
	private String endereco;
	
}
