package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Rodada;

@ManagedBean
@SessionScoped
public class RodadaMB {
	
	private ArrayList<Rodada> lista = new ArrayList<Rodada>();
	
	private Rodada rod = new Rodada();
	
	public void salvar() {
		lista.add(rod);
		rod = new Rodada();
	}

	public ArrayList<Rodada> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Rodada> lista) {
		this.lista = lista;
	}

	public Rodada getCamp() {
		return rod;
	}

	public void setCamp(Rodada rod) {
		this.rod = rod;
	}
}