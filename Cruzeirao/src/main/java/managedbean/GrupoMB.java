package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Grupo;

@ManagedBean
@SessionScoped
public class GrupoMB {
	
	private ArrayList<Grupo> lista = new ArrayList<Grupo>();
	
	private Grupo grupo = new Grupo();
	
	public void salvar() {
		lista.add(grupo);
		grupo = new Grupo();
	}

	public ArrayList<Grupo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Grupo> lista) {
		this.lista = lista;
	}

	public Grupo getCamp() {
		return grupo;
	}

	public void setCamp(Grupo grupo) {
		this.grupo = grupo;
	}
}