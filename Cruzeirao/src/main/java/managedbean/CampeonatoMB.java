package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Campeonato;

@ManagedBean
@SessionScoped
public class CampeonatoMB {
	
	private ArrayList<Campeonato> lista = new ArrayList<Campeonato>();
	
	private Campeonato camp = new Campeonato();
	
	public void salvar() {
		lista.add(camp);
		camp = new Campeonato();
	}

	public ArrayList<Campeonato> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Campeonato> lista) {
		this.lista = lista;
	}

	public Campeonato getCamp() {
		return camp;
	}

	public void setCamp(Campeonato camp) {
		this.camp = camp;
	}
}
