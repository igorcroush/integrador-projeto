package locadora.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
	
	private String cpf;
	private String cargo;
	@Column(name = "senha_func", nullable = false)
	private String senha;

	


}
