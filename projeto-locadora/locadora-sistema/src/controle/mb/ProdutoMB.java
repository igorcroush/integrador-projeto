package controle.mb;

import java.util.ArrayList;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import locadora.dao.GenericoDAO;
import locadora.modelo.Item;


@ManagedBean
@ViewScoped
public class ProdutoMB {

	private Item produto = new Item();
	private List<Item> produtos = new ArrayList();
	private GenericoDAO<Item> daoGenerico = new GenericoDAO<Item>(Item.class);

	public ProdutoMB() {
		produtos = daoGenerico.buscarTodos();
	}

	public Item salvar() {
		if (produto.getId() == null) {
			daoGenerico.salvar(produto);
		} else {
			daoGenerico.alterar(produto);
		}
		produtos = daoGenerico.buscarTodos();
		produto = new Item();
		return produto;
	}

	public boolean excluir(Long id) {
		
		daoGenerico.excluir(id);
		produtos = daoGenerico.buscarTodos();
		return true;

	}

	public Item getProduto() {
		return produto;
	}

	public void setProduto(Item produto) {
		this.produto = produto;
	}

	public List<Item> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Item> produtos) {
		this.produtos = produtos;
	}

	public GenericoDAO<Item> getDaoGenerico() {
		return daoGenerico;
	}

	public void setDaoGenerico(GenericoDAO<Item> daoGenerico) {
		this.daoGenerico = daoGenerico;
	}

	
}
