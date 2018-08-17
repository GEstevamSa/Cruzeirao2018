package managedbean;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Equipe;

@ManagedBean
@SessionScoped
public class EquipeMB {
	
	private ArrayList<Equipe> lista = new ArrayList<Equipe>();
	
	private Equipe equipe =  new Equipe();
		
	public String salvar() {
		lista.add(equipe);
		equipe = new Equipe();
		return "Equipe";
	}

	public ArrayList<Equipe> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Equipe> lista) {
		this.lista = lista;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
}
