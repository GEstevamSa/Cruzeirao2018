package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.PartidasFutebol;

@ManagedBean
@SessionScoped
public class PartidasFutebolMB {
	
	private ArrayList<PartidasFutebol> lista = new ArrayList<PartidasFutebol>();
	
	private PartidasFutebol part = new PartidasFutebol();
	
	public void salvar() {
		lista.add(part);
		part = new PartidasFutebol();
	}

	public ArrayList<PartidasFutebol> getLista() {
		return lista;
	}

	public void setLista(ArrayList<PartidasFutebol> lista) {
		this.lista = lista;
	}

	public PartidasFutebol getCamp() {
		return part;
	}

	public void setCamp(PartidasFutebol part) {
		this.part = part;
	}
}