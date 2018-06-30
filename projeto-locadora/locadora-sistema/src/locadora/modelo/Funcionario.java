package locadora.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
	@Column(name = "cpf_func", nullable = false)
	private String cpf;
	@Column(name = "cargo_func", nullable = false)
	private String cargo;
	@Column(name = "senha_func", nullable = false)
	private String senha;

}
