package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Fase;
import cruzeiro.Grupo;
import cruzeiro.Rodada;
import service.GrupoService;

@ManagedBean
@SessionScoped
public class GrupoMB {
	
	
	private GrupoService grupoService = new GrupoService();
	private Grupo novoGrupo = new Grupo();
	private Fase novaFase;
	private Rodada novaRodada;
	
	public String salvar() {
		grupoService.salvar(novoGrupo);
		novoGrupo = new Grupo();
		return "menu";
	}
	
	public List <Grupo> getGrupos(){
		return grupoService.getGrupos();
	}
	
	public String criarFases() {
		novaFase = new Fase();
		return "fase";
	}
	
	public String criarRodadas() {
		novaRodada = new Rodada();
		return "rodada";
	}

	public Grupo getNovoGrupo() {
		return novoGrupo;
	}

	public void setNovoGrupo(Grupo novoGrupo) {
		this.novoGrupo = novoGrupo;
	}

	public Fase getNovaFase() {
		return novaFase;
	}

	public void setNovaFase(Fase novaFase) {
		this.novaFase = novaFase;
	}

	public Rodada getNovaRodada() {
		return novaRodada;
	}

	public void setNovaRodada(Rodada novaRodada) {
		this.novaRodada = novaRodada;
	}
	/*
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
	*/
}