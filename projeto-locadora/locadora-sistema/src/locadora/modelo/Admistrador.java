package locadora.modelo;

import javax.persistence.Column;

public class Admistrador {
	private String cpf;
	@Column(name = "senha_func", nullable = false)
	private String senha;
}