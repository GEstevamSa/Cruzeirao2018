package managedbean;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cruzeiro.Grupo;
import cruzeiro.Inscricao;
import cruzeiro.Partida;
import service.PartidaService;

@ManagedBean
@SessionScoped
public class RodadaMB {
	
	private PartidaService partidaService = new PartidaService();
	private Partida novaPartida = new Partida();
	private Inscricao novaInscricao;
	private Grupo novoGrupo;
	
	public String salvar() {
		partidaService.salvar(novaPartida);
		novaPartida = new Partida();
		return "menu";
	}
	
	public List <Partida> getPartidas(){
		return partidaService.getPartidas();
	}
	
	public String criarInscricao() {
		novaInscricao = new Inscricao();
		return "cadastroPartida";
	}
	
	public String criarGrupo() {
		novoGrupo = new Grupo();
		return "cadastroGrupo";
	}

	public Partida getNovaPartida() {
		return novaPartida;
	}

	public void setNovaPartida(Partida novaPartida) {
		this.novaPartida = novaPartida;
	}

	public Inscricao getNovaInscricao() {
		return novaInscricao;
	}

	public void setNovaInscricao(Inscricao novaInscricao) {
		this.novaInscricao = novaInscricao;
	}

	public Grupo getNovoGrupo() {
		return novoGrupo;
	}

	public void setNovoGrupo(Grupo novoGrupo) {
		this.novoGrupo = novoGrupo;
	}

	/*
	
	private ArrayList<Rodada> lista = new ArrayList<>();
	
	private Rodada rodada = new Rodada();
	
	public void salvar() {
		lista.add(rodada);
		rodada = new Rodada();
	}
	
	public ArrayList<Rodada> getLista(){
		return lista;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

	public void setLista(ArrayList<Rodada> lista) {
		this.lista = lista;
	}
	
	

	
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
	*/
	
}