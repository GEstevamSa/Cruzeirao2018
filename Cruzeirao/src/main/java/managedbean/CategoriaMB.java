package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Categoria;

@ManagedBean
@SessionScoped
public class CategoriaMB {
	
private ArrayList<Categoria> lista = new ArrayList<Categoria>();
	
	private Categoria categoria = new Categoria();
	
	public void salvar() {
		lista.add(categoria);
		categoria = new Categoria();
	}

	public ArrayList<Categoria> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Categoria> lista) {
		this.lista = lista;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
