package locadora.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;

public class ItemLocacao {
	
	private Date dataLoca;
	private Integer qntde;
	private Double valorTotal;
	@JoinColumn(name = "cod_midiafk", referencedColumnName = "cod_midia", nullable = false)
	private Midia midia;
	@JoinColumn(name = "cod_local", referencedColumnName = "cod_loca", nullable = false)
	private Locacao locacao;
	private Boolean status;
}
