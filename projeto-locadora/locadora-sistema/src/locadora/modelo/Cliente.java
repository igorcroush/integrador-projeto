package locadora.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="tab-cliente")
public class Cliente extends Pessoa{
  private Double multa;
  @Column(name = "cpf_cliente", nullable = false, length = 14)
  private String cpf;
  @JoinColumn(name = "cod_depe", referencedColumnName = "cod_depe", nullable = true)
  private Dependente dependente;
}
