package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Local;

@ManagedBean
@SessionScoped
public class LocalMB {
	
	private ArrayList<Local> lista = new ArrayList<Local>();
	
	private Local loc = new Local();
	
	public void salvar() {
		lista.add(loc);
		loc = new Local();
	}

	public ArrayList<Local> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Local> lista) {
		this.lista = lista;
	}

	public Local getCamp() {
		return loc;
	}

	public void setCamp(Local loc) {
		this.loc = loc;
	}
}