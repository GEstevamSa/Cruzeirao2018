package managedbean;



import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Equipe;
import service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeMB {
	
	private EquipeService equipeService = new EquipeService();
	private Equipe equipe = new Equipe();
	private Equipe novaEquipe;
	
	public String salvar() {
		equipeService.salvar(novaEquipe);
		novaEquipe = new Equipe();
		return "menu";
	}
	
	public List <Equipe> getEquipes()
	{
		return equipeService.getEquipes();
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	
	
	/*
	
	
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
	*/
}
