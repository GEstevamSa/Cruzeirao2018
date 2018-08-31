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
public class PartidaMB {
	
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
	*/
	
}