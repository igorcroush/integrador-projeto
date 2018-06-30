package locadora.modelo;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Filme extends Midia {
	
	private Double duracao;
	private String sinopse;
	private Date anoLanc;
}
