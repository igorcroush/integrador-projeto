package locadora.modelo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="tab_midia")
public class Midia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="tituloMidia",nullable =false)
	private String titulo;
	@Column(name="TipoMidia",nullable =false)
	private String tipo;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="anoLancamento",nullable = true)
	private Date anoLanc;
	private BigDecimal valorLoca;
	@Column(name="infoMidia",nullable = true)
	private String info_midia;
	@Column(name="classificacao",nullable = true)
	private String faixaEtaria;
	@Column(name="estado_midia",nullable = true)
	private String estado_midia;
	@Column(name="generoMidia",nullable = true)
	private String genero;

}
