package locadora.modelo;

import javax.persistence.Entity;

@Entity
public class Jogo extends Midia{
	private Integer numero_Jogadores;
	private String plataforma;
}
