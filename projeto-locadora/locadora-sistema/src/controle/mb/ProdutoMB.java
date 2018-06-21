package controle.mb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import locadora.dao.GenericoDAO;
import locadora.modelo.Produto;

@ManagedBean
@ViewScoped
public class ProdutoMB {

	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList();
	private GenericoDAO<Produto> daoGenerico = new GenericoDAO<Produto>(Produto.class);

	public ProdutoMB() {
		produtos = daoGenerico.buscarTodos();
	}

	public Produto salvar() {
		if (produto.getId() == null) {
			daoGenerico.salvar(produto);
		} else {
			daoGenerico.alterar(produto);
		}
		produtos = daoGenerico.buscarTodos();
		produto = new Produto();
		return produto;
	}

	public boolean excluir(Long id) {
		
		daoGenerico.excluir(id);
		produtos = daoGenerico.buscarTodos();
		return true;

	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public GenericoDAO<Produto> getDaoGenerico() {
		return daoGenerico;
	}

	public void setDaoGenerico(GenericoDAO<Produto> daoGenerico) {
		this.daoGenerico = daoGenerico;
	}

}
