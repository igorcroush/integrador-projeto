package locadora.modelo;

import javax.persistence.Entity;

@Entity
@Table(name="tab_forncedor")
public class Fornecedor extends Pessoa{
  private String cnpj;
}
