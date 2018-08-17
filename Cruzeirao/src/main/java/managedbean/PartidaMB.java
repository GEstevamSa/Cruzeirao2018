package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Partida;

@ManagedBean
@SessionScoped
public class PartidaMB {
	
	private ArrayList<Partida> lista = new ArrayList<Partida>();
	
	private Partida par = new Partida();
	
	public void salvar() {
		lista.add(par);
		par = new Partida();
	}

	public ArrayList<Partida> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Partida> lista) {
		this.lista = lista;
	}

	public Partida getCamp() {
		return par;
	}

	public void setCamp(Partida par) {
		this.par = par;
	}
}