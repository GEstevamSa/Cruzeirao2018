package managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Equipe;
import service.EquipeService;

@ManagedBean
@SessionScoped
public class EquipeMB {
	
	private EquipeService equipeService = new EquipeService();
	
	private Equipe equipeAtual;
	private Equipe novaEquipe = new Equipe();
	
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
		return equipeAtual;
	}

	public EquipeService getEquipeService() {
		return equipeService;
	}

	public void setEquipeService(EquipeService equipeService) {
		this.equipeService = equipeService;
	}

	public Equipe getNovaEquipe() {
		return novaEquipe;
	}

	public void setNovaEquipe(Equipe novaEquipe) {
		this.novaEquipe = novaEquipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipeAtual = equipe;
	}
	
}
